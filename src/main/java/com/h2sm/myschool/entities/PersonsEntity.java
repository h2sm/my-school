package com.h2sm.myschool.entities;

import com.h2sm.myschool.enums.Gender;
import com.h2sm.myschool.enums.Position;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class PersonsEntity {
    @Id
    private long personID;
    @Column(name = "name")
    private String name;
    private String middleName;
    private String surname;
    private String email;
    private Gender gender;
    private Position position;

}
