package com.h2sm.myschool.services;

import com.h2sm.myschool.dto.TimetableDTO;
import com.h2sm.myschool.dto.TimetableWebDTO;
import com.h2sm.myschool.mapper.TimetableMapper;
import com.h2sm.myschool.repository.ClassMemberRepository;
import com.h2sm.myschool.repository.ClassRepository;
import com.h2sm.myschool.repository.TimetableRepository;
import com.h2sm.myschool.security.SecurityUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TimetableService {
    private TimetableRepository timetableRepository;
    private ClassMemberRepository classMemberRepository;
    private TimetableMapper timetableMapper;

    public Map<String, List<TimetableWebDTO>> getTimetableForThisStudent() {
        Map<String, List<TimetableWebDTO>> optimisedTable = new HashMap<>();
        var classMemberEntity = classMemberRepository.getClassMemberEntityByStudent_EmailContaining(SecurityUtils.getCurrentUsername().get()).get();
        var timetable = timetableRepository.getAllByClassEntityEquals(classMemberEntity.getClassEntity())
                .stream()
                .map(table -> timetableMapper.entityToDTO(table))
                .collect(Collectors.toList());

        timetable.forEach(action -> {
            if (!optimisedTable.containsKey(action.getDayOfWeek())) {
                var thisDay = action.getDayOfWeek();
                var subjectsForThisDay = timetable
                        .stream()
                        .filter(subject -> subject.getDayOfWeek().equals(thisDay))
                        .map(timetableMapper::dtoToWebDTO)
                        .collect(Collectors.toList());
                optimisedTable.put(thisDay, subjectsForThisDay);
            }
        });
        System.out.println(optimisedTable);
        return optimisedTable;
    }
}
