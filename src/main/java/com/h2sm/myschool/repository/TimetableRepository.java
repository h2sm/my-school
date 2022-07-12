package com.h2sm.myschool.repository;

import com.h2sm.myschool.entities.ClassEntity;
import com.h2sm.myschool.entities.TimetableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimetableRepository extends JpaRepository<TimetableEntity, Long> {
    List<TimetableEntity> getAllByClassEntityEquals(ClassEntity classname);
}
