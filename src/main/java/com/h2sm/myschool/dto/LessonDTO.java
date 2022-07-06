package com.h2sm.myschool.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LessonDTO {
    private long lessonID;
    private SubjectDTO subjectDTO;
    private ClassDTO participatingClass;
    private Date dateOfLesson;
    private String givenHomework;
    private String lessonDescription;
}
