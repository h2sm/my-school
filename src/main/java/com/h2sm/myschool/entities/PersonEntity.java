package com.h2sm.myschool.entities;

import com.h2sm.myschool.enums.Gender;
import com.h2sm.myschool.enums.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "persons")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long personID;
    @Column(name = "name")
    private String name;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "position")
    @Enumerated(EnumType.STRING)
    private Position position;

}
