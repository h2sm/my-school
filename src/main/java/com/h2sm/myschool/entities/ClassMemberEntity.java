package com.h2sm.myschool.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "classmembers")
@Data
public class ClassMemberEntity implements Serializable{
    @Id
    @Column(name = "unique_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @JoinColumn(name = "class_id")
    @OneToOne
    private ClassEntity classEntity;
    @JoinColumn(name = "student_id")
    @OneToOne
    private PersonEntity student;
}
