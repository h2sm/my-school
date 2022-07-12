package com.h2sm.myschool.mapper;

import com.h2sm.myschool.dto.ClassDTO;
import com.h2sm.myschool.entities.ClassEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ClassMapper implements BaseMapper<ClassEntity, ClassDTO> {
    private PersonMapper personMapper;
    @Override
    public ClassDTO entityToDTO(ClassEntity entity) {
        return ClassDTO.builder()
                .classID(entity.getId())
                .className(entity.getClassName())
                .homeroomTeacher(personMapper.entityToDTO(entity.getHomeroomTeacher()))
                .build();
    }

    @Override
    public ClassEntity DTOtoEntity(ClassDTO dto) {
        return null;
    }
}
