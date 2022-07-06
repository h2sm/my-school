package com.h2sm.myschool.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ClassDTO {
    private long classID;
    private PersonDTO homeroomTeacher;
    private List<PersonDTO> listOfStudents;
    private String className;
}
