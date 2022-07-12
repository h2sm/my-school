package com.h2sm.myschool.mapper;

import com.h2sm.myschool.dto.MarkDTO;
import com.h2sm.myschool.entities.MarkEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@AllArgsConstructor
public class MarkMapper implements BaseMapper<MarkEntity, MarkDTO> {
    private LessonMapper lessonMapper;
    private PersonMapper personMapper;
    @Override
    public MarkDTO entityToDTO(MarkEntity entity) {
        return MarkDTO.builder()
                .markID(entity.getId())
                .mark(entity.getMark())
                .lesson(lessonMapper.entityToDTO(entity.getLesson()))
                .student(personMapper.entityToDTO(entity.getStudent()))
                .description(entity.getDescription())
                .date(new Date(entity.getDate().getTime()))
                .build();
    }

    @Override
    public MarkEntity DTOtoEntity(MarkDTO dto) {
        return null;
    }
}
