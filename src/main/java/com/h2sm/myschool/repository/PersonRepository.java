package com.h2sm.myschool.repository;

import com.h2sm.myschool.entities.PersonEntity;
import com.h2sm.myschool.enums.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
    List<PersonEntity> findByNameEquals(String name);
    List<PersonEntity> findByPositionEquals(Position position);
}
