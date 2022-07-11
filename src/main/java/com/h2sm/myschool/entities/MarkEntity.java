package com.h2sm.myschool.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Table(name = "marks")
@Data
@Entity
public class MarkEntity {
    @Id
    @Column(name = "mark_id")
    private long id;
    @Column(name = "mark")
    private int mark;
    @JoinColumn(name = "lesson_id")
    @OneToOne
    private LessonEntity lesson;
    @JoinColumn(name = "student_id")
    @OneToOne
    private PersonEntity student;
    @Column(name = "date")
    private Date date;
    @Column(name = "description")
    private String description;
}
