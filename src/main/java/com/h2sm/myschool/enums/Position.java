package com.h2sm.myschool.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public enum Position {
    TEACHER(Set.of(Permission.TEACHER_READ, Permission.TEACHER_WRITE)),
    STUDENT(Set.of(Permission.STUDENT_READ)),
    ADMINISTRATION(Set.of(Permission.ADM_READ, Permission.ADM_WRITE));

    private final Set<Permission> permissions;

    public Set<SimpleGrantedAuthority> getAuthorities(){
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}