package com.h2sm.myschool.dto;

import com.h2sm.myschool.enums.Gender;
import com.h2sm.myschool.enums.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PersonDTO {
    private long personID;
    private String name;
    private String middleName;
    private String surname;
    private String email;
    private Gender gender;
    private Position position;
}
