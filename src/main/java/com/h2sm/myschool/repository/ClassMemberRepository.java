package com.h2sm.myschool.repository;

import com.h2sm.myschool.entities.ClassMemberEntity;
import com.h2sm.myschool.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface ClassMemberRepository extends JpaRepository<ClassMemberEntity, Long> {
    Optional<ClassMemberEntity> getAllByStudent_EmailEquals(String email);
    Optional<ClassMemberEntity> getClassMemberEntityByStudent_EmailContaining(String email);
}
