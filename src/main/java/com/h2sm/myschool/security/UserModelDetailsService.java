package com.h2sm.myschool.security;

import com.h2sm.myschool.entities.PersonEntity;
import com.h2sm.myschool.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Authenticate a user from the database.
 */
@Component("userDetailsService")
@AllArgsConstructor
@Slf4j
public class UserModelDetailsService implements UserDetailsService {
   private final PersonRepository userRepository;

   @Override
   @Transactional
   public UserDetails loadUserByUsername(final String login) {
      log.debug("Authenticating user '{}'", login);

      String lowercaseLogin = login.toLowerCase(Locale.ENGLISH);
      return userRepository.findPersonEntityByEmail(lowercaseLogin)
         .map(this::createSpringSecurityUser)
         .orElseThrow(() -> new UsernameNotFoundException("User " + lowercaseLogin + " was not found in the database"));
   }

   private User createSpringSecurityUser(PersonEntity user) {
      List<GrantedAuthority> grantedAuthorities = user.getPosition().getAuthorities().stream()
         .map(authority -> new SimpleGrantedAuthority(authority.getAuthority()))
         .collect(Collectors.toList());
      return new User(user.getEmail(),
         user.getPassword(),
         grantedAuthorities);
   }
}
