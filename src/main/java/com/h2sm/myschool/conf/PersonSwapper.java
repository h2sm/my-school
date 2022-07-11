package com.h2sm.myschool.conf;

import com.h2sm.myschool.dto.PersonDTO;
import com.h2sm.myschool.entities.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonSwapper implements EntitySwapper<PersonEntity, PersonDTO>{
    @Override
    public PersonDTO entityToDTO(PersonEntity entity) {
        return PersonDTO.builder()
                .email(entity.getEmail())
                .personID(entity.getPersonID())
                .gender(entity.getGender())
                .middleName(entity.getMiddleName())
                .name(entity.getName())
                .position(entity.getPosition())
                .surname(entity.getSurname())
                .build();
    }

    @Override
    public PersonEntity DTOtoEntity(PersonDTO dto) {
        return PersonEntity.builder()
                .email(dto.getEmail())
                .personID(dto.getPersonID())
                .gender(dto.getGender())
                .middleName(dto.getMiddleName())
                .name(dto.getName())
                .surname(dto.getSurname())
                .password(null)
                .position(dto.getPosition())
                .build();
    }
}
