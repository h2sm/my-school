package com.h2sm.myschool.repository;

import com.h2sm.myschool.entities.LessonEntity;
import com.h2sm.myschool.entities.MarkEntity;
import com.h2sm.myschool.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarkRepository extends JpaRepository<MarkEntity, Long> {
    List<MarkEntity> findByStudentEqualsAndLessonEquals(PersonEntity student, LessonEntity lesson);
    List<MarkEntity> findByStudentEquals(PersonEntity person);
}
