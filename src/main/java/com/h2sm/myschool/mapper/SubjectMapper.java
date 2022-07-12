package com.h2sm.myschool.mapper;

import com.h2sm.myschool.dto.SubjectDTO;
import com.h2sm.myschool.entities.SubjectEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SubjectMapper implements BaseMapper<SubjectEntity, SubjectDTO> {
    private PersonMapper personMapper;
    @Override
    public SubjectDTO entityToDTO(SubjectEntity entity) {
        return SubjectDTO.builder()
                .subjectID(entity.getId())
                .subjectName(entity.getSubjectName())
                .subjectType(entity.getSubjectType())
                .subjectDescription(entity.getSubjectDescription())
                .teacherDTO(personMapper.entityToDTO(entity.getTeacher()))
                .build();
    }

    @Override
    public SubjectEntity DTOtoEntity(SubjectDTO dto) {
        return null;
    }
}
