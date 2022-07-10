package com.h2sm.myschool.repository;

import com.h2sm.myschool.entities.TimetableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimetableRepository extends JpaRepository<TimetableEntity, Long> {
}
