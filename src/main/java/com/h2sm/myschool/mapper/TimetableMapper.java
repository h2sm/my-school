package com.h2sm.myschool.mapper;

import com.h2sm.myschool.dto.TimetableDTO;
import com.h2sm.myschool.dto.TimetableWebDTO;
import com.h2sm.myschool.entities.TimetableEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@AllArgsConstructor
public class TimetableMapper implements BaseMapper<TimetableEntity, TimetableDTO> {
    private SubjectMapper subjectMapper;
    @Override
    public TimetableDTO entityToDTO(TimetableEntity entity) {
        return TimetableDTO.builder()
                .id(entity.getId())
                .subjectDTO(subjectMapper.entityToDTO(entity.getSubjects()))
                .timeStart(entity.getTimeStart())
                .timeStop(entity.getTimeStop())
                .dayOfWeek(entity.getDayOfWeek().toString().toLowerCase(Locale.ROOT))
                .build();
    }

    public TimetableWebDTO dtoToWebDTO(TimetableDTO dto){//это ваще пиздец полный, 7 часов ебался с библиотекой которая табличку делает удобную, пришлось под конец самому ее делать потому что нихера не мапила она :)
        return TimetableWebDTO.builder()
                .name(dto.getSubjectDTO())
                .id(dto.getId())
                .type("custom")
                .startTime(dto.getTimeStart())
                .endTime(dto.getTimeStop())
                .build();
    }

    @Override
    public TimetableEntity DTOtoEntity(TimetableDTO dto) {
        return null;
    }
}
