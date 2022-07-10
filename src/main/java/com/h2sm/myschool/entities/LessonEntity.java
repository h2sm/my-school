package com.h2sm.myschool.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "lessons")
@Data
@Entity
public class LessonEntity {
    @Id
    @Column(name = "lesson_id")
    private long id;
    @Column(name = "subject_id")
    @OneToOne
    private SubjectEntity subjectEntity;
    @Column(name = "homework")
    private String homework;
    @Column(name = "lesson_description")
    private String lessonDescription;
    @Column(name = "date_of_lesson")
    private Date dateOfLesson;
    @Column(name = "class_id")
    @OneToOne
    private ClassEntity participatingClass;
}
