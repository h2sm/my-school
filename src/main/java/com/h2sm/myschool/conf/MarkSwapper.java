package com.h2sm.myschool.conf;

import com.h2sm.myschool.dto.MarkDTO;
import com.h2sm.myschool.entities.MarkEntity;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MarkSwapper implements EntitySwapper<MarkEntity, MarkDTO> {
    @Override
    public MarkDTO entityToDTO(MarkEntity entity) {
        return MarkDTO.builder()
                .markID(entity.getId())
                .mark(entity.getMark())
                .lesson(null)
                .description(entity.getDescription())
                .date(new Date(entity.getDate().getTime()))
                .build();
    }

    @Override
    public MarkEntity DTOtoEntity(MarkDTO dto) {
        return null;
    }
}
