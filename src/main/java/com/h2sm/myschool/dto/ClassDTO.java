package com.h2sm.myschool.dto;

import com.h2sm.myschool.dto.persons.StudentDTO;
import com.h2sm.myschool.dto.persons.TeacherDTO;

import java.util.List;

public class ClassModel {
    private TeacherDTO teacherDTO;
    private List<StudentDTO> students;
    private String className;
}
