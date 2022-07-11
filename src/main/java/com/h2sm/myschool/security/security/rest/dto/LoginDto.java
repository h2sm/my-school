package com.h2sm.myschool.security.security.rest.dto;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.Size;

/**
 * DTO for storing a user's credentials.
 */
@Data
public class LoginDto {

   @NotNull
   @Size(min = 1, max = 50)
   private String username;

   @NotNull
   @Size(min = 4, max = 100)
   private String password;

   private Boolean rememberMe;

}
