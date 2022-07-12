package com.h2sm.myschool.security.rest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for storing a user's credentials.
 */
@Data
@NoArgsConstructor
public class LoginDto {
   private String username;
   private String password;
   private Boolean rememberMe;

   public LoginDto(@JsonProperty(value = "username") String username,
                   @JsonProperty(value = "password") String password,
                   @JsonProperty(value = "rememberMe") Boolean rememberMe){
      this.username=username;
      this.password=password;
      this.rememberMe=rememberMe;
   }

}
