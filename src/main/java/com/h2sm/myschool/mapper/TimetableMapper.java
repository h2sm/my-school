package com.h2sm.myschool.mapper;

import com.h2sm.myschool.dto.TimetableDTO;
import com.h2sm.myschool.entities.TimetableEntity;
import org.springframework.stereotype.Component;

@Component
public class TimetableMapper implements EntitySwapper<TimetableEntity, TimetableDTO>{
    @Override
    public TimetableDTO entityToDTO(TimetableEntity entity) {
        return TimetableDTO.builder()
                .id(entity.getId())
                .subjectDTO(entity.getSubjects().getSubjectName())
                .timeStart(entity.getTimeStart())
                .timeStop(entity.getTimeStop())
                .dayOfWeek(entity.getDayOfWeek().toString())
                .build();
    }

    @Override
    public TimetableEntity DTOtoEntity(TimetableDTO dto) {
        return null;
    }
}
