package com.h2sm.myschool.entities;

import com.h2sm.myschool.enums.SubjectType;
import lombok.Data;

import javax.persistence.*;

@Table(name = "subjects")
@Data
@Entity
public class SubjectsEntity {
    @Id
    @Column(name = "subject_id")
    private long id;
    @Column(name = "teacher_id")
    @OneToOne
    private PersonsEntity teacher;
    @Column(name = "subject_name")
    private String subjectName;
    @Column(name = "subject_description")
    private String subjectDescription;
    @Column(name = "subject_type")
    @Enumerated
    private SubjectType subjectType;
}
