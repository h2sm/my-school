package com.h2sm.myschool.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "classmembers")
@Data
public class ClassMembersEntity {
    @Id
    private long id;
    @Column(name = "class_id")
    @OneToOne
    private ClassesEntity classEntity;
    @Column(name = "student_id")
    @OneToOne
    private PersonsEntity student;
}
