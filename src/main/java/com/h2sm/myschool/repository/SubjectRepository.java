package com.h2sm.myschool.repository;

import com.h2sm.myschool.entities.PersonEntity;
import com.h2sm.myschool.entities.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<SubjectEntity, Long> {
    List<SubjectEntity> findByTeacherEquals(PersonEntity teacher);
    List<SubjectEntity> findBySubjectNameContains(String subjectName);
}
