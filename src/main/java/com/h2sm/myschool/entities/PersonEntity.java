package com.h2sm.myschool.entities;

import com.h2sm.myschool.enums.Gender;
import com.h2sm.myschool.enums.Position;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "persons")
public class PersonEntity {
    @Id
    @Column(name = "person_id")
    private long personID;
    @Column(name = "name")
    private String name;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    @Enumerated
    private Gender gender;
    @Column(name = "position")
    @Enumerated
    private Position position;

}
