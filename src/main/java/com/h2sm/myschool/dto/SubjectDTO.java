package com.h2sm.myschool.dto;

import com.h2sm.myschool.enums.SubjectType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SubjectDTO {
    private long subjectID;
    private PersonDTO teacherDTO;
    private String subjectName;
    private String subjectDescription;
    private SubjectType subjectType;
}
