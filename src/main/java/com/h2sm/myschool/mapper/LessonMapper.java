package com.h2sm.myschool.mapper;

import com.h2sm.myschool.dto.LessonDTO;
import com.h2sm.myschool.entities.LessonEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class LessonMapper implements BaseMapper<LessonEntity, LessonDTO> {
    private SubjectMapper subjectMapper;
    private ClassMapper classMapper;
    @Override
    public LessonDTO entityToDTO(LessonEntity entity) {
        return LessonDTO.builder()
                .dateOfLesson(entity.getDateOfLesson())
                .lessonID(entity.getId())
                .lessonDescription(entity.getLessonDescription())
                .givenHomework(entity.getHomework())
                .subjectDTO(subjectMapper.entityToDTO(entity.getSubjectEntity()))
                .participatingClass(classMapper.entityToDTO(entity.getParticipatingClass()))
                .build();
    }

    @Override
    public LessonEntity DTOtoEntity(LessonDTO dto) {
        return null;
    }
}
