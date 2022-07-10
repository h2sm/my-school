package com.h2sm.myschool.repository;

import com.h2sm.myschool.entities.ClassEntity;
import com.h2sm.myschool.entities.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface LessonRepository extends JpaRepository<LessonEntity, Long> {
    List<LessonEntity> findByDateOfLessonEqualsAndParticipatingClass(Date exactDate, ClassEntity classEntity);

}
