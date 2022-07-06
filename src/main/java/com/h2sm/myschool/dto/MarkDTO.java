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
public class MarkDTO {
    private long markID;
    private int mark;
    private LessonDTO lesson;
    private PersonDTO student;
    private Date date;
    private String description;
}
