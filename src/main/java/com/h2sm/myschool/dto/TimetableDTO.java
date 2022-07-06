package com.h2sm.myschool.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.DayOfWeek;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TimetableDTO {
    private long id;
    private ClassDTO classDTO;
    private SubjectDTO subjectDTO;
    private Time timeStart;
    private Time timeStop;
    private DayOfWeek dayOfWeek;
}
