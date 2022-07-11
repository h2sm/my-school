package com.h2sm.myschool.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "classmembers")
@Data
public class ClassMemberEntity {
    @Id
    private long id;
    @JoinColumn(name = "class_id")
    @OneToOne
    private ClassEntity classEntity;
    @JoinColumn(name = "student_id")
    @OneToOne
    private PersonEntity student;
}
