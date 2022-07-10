package com.h2sm.myschool.repository;

import com.h2sm.myschool.entities.ClassMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassMemberRepository extends JpaRepository<ClassMemberEntity, Long> {
}
