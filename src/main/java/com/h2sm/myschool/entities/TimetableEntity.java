package com.h2sm.myschool.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.time.DayOfWeek;

@Table(name = "timetable")
@Data
@Entity
public class TimetableEntity {
    @Id
    @Column(name = "table_row_id")
    private long id;
    @Column(name = "class_id")
    @OneToOne
    private ClassesEntity classesEntity;
    @Column(name = "subject_id")
    @OneToOne
    private SubjectsEntity subjects;
    @Column(name = "lesson_start_timestamp")
    private Time timeStart;
    @Column(name = "lesson_stop_timestamp")
    private Time timeStop;
    @Column(name = "day_of_week")
    @Enumerated
    private DayOfWeek dayOfWeek;
}
