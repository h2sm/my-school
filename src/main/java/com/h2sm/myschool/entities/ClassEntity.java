package com.h2sm.myschool.entities;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "classes")
@Data
public class ClassEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "class_id")
    private long id;
    @Column(name = "class_name")
    private String className;
    @JoinColumn(name = "homeroom_teacher_id")
    @OneToOne
    private PersonEntity homeroomTeacher;
}
