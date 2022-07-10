package com.h2sm.myschool.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "classes")
@Data
public class ClassEntity {
    @Id
    @Column(name = "class_id")
    private long id;
    @Column(name = "class_name")
    private String className;
    @Column(name = "homeroom_teacher_id")
    @OneToOne
    private PersonEntity homeroomTeacher;
}
