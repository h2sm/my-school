package com.h2sm.myschool.services;

import com.h2sm.myschool.dto.TimetableDTO;
import com.h2sm.myschool.mapper.TimetableMapper;
import com.h2sm.myschool.repository.ClassMemberRepository;
import com.h2sm.myschool.repository.ClassRepository;
import com.h2sm.myschool.repository.TimetableRepository;
import com.h2sm.myschool.security.SecurityUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TimetableService {
    private TimetableRepository timetableRepository;
    private ClassMemberRepository classMemberRepository;
    private TimetableMapper timetableMapper;

    public List<TimetableDTO> getTimetableForThisStudent() {
        String name = SecurityUtils.getCurrentUsername().get();
        var x = classMemberRepository.getClassMemberEntityByStudent_EmailContaining(name).get();

        return timetableRepository.getAllByClassEntityEquals(x.getClassEntity())
                .stream()
                .map(table -> timetableMapper.entityToDTO(table))
                .collect(Collectors.toList());
    }
}
