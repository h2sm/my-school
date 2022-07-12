package com.h2sm.myschool.security.rest;

import com.h2sm.myschool.mapper.PersonMapper;
import com.h2sm.myschool.dto.PersonDTO;
import com.h2sm.myschool.security.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

   private final UserService userService;
   private PersonMapper personSwapper;

   public UserRestController(UserService userService) {
      this.userService = userService;
   }

   @GetMapping("/user")
   public ResponseEntity<PersonDTO> getActualUser() {
      return ResponseEntity.ok(personSwapper.entityToDTO(userService.getUserWithAuthorities().get()));
   }
}
