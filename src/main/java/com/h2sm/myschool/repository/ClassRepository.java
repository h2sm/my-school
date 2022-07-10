package com.h2sm.myschool.repository;

import com.h2sm.myschool.entities.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity, Long> {
    List<ClassEntity> findByClassNameContains(String classname);
    List<ClassEntity> findByHomeroomTeacher_PersonIDIs(Long teacherID);
}
