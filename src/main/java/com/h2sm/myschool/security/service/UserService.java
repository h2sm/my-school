package com.h2sm.myschool.security.service;

import com.h2sm.myschool.entities.PersonEntity;
import com.h2sm.myschool.repository.PersonRepository;
import com.h2sm.myschool.security.SecurityUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class UserService {

   private final PersonRepository userRepository;

   @Transactional(readOnly = true)
   public Optional<PersonEntity> getUserWithAuthorities() {
      return SecurityUtils.getCurrentUsername().flatMap(userRepository::findPersonEntityByEmail);
   }

}
