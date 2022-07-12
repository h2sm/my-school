package com.h2sm.myschool.entities;

import com.h2sm.myschool.enums.SubjectType;
import lombok.Data;

import javax.persistence.*;

@Table(name = "subjects")
@Data
@Entity
public class SubjectEntity {
    @Id
    @Column(name = "subject_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @JoinColumn(name = "teacher_id")
    @OneToOne
    private PersonEntity teacher;
    @Column(name = "subject_name")
    private String subjectName;
    @Column(name = "subject_description")
    private String subjectDescription;
    @Column(name = "subject_type")
    @Enumerated(value = EnumType.STRING)
    private SubjectType subjectType;
}
