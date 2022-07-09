package com.h2sm.myschool.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Permission {
    TEACHER_READ("teacher:read"),
    TEACHER_WRITE("teacher:write"),
    STUDENT_READ("student:read"),
    ADM_READ("adm:read"),
    ADM_WRITE("adm_write");
    private final String permission;
}
