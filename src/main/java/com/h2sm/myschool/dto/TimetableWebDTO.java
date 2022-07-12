package com.h2sm.myschool.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Time;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimetableWebDTO {
    private long id;
    private String name;
    private String type;
    private Time startTime;
    private Time endTime;
}
