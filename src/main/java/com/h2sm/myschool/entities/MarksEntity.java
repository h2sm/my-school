package com.h2sm.myschool.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "marks")
@Data
@Entity
public class MarksEntity {
    @Id
    @Column(name = "mark_id")
    private long id;
    @Column(name = "mark")
    private int mark;
    @Column(name = "lesson_id")
    @OneToOne
    private LessonsEntity lesson;
    @Column(name = "student_id")
    @OneToOne
    private PersonsEntity student;
    @Column(name = "date")
    private Date date;
    @Column(name = "description")
    private String description;
}
