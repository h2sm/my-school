package com.h2sm.myschool.services;

import com.h2sm.myschool.mapper.MarkMapper;
import com.h2sm.myschool.dto.MarkDTO;
import com.h2sm.myschool.repository.MarkRepository;
import com.h2sm.myschool.repository.PersonRepository;
import com.h2sm.myschool.security.SecurityUtils;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class MarksService {
    private MarkRepository markRepository;
    private PersonRepository personRepository;
    private MarkMapper markSwapper;

    public List<MarkDTO> getAllMarksForGivenLesson(String subject){
        return null;
    }

    //Collectors.toMap(MarkDTO::getLesson, Function.identity()
    public Map<String, List<MarkDTO>> getAllMarksForGivenStudent(){
        Map<String, List<MarkDTO>> subjectsAndMarksMap = new HashMap<>();

        var desiredPerson = personRepository
                .findPersonEntityByEmail(SecurityUtils.getCurrentUsername().get()).get();

        var marks = markRepository.findByStudentEquals(desiredPerson)
                .stream()
                .map(mark -> markSwapper.entityToDTO(mark))
                .collect(Collectors.toList());

        marks.forEach(mark -> {
            var subjectName = mark.getLesson().getSubjectDTO().getSubjectName();
            if (!subjectsAndMarksMap.containsKey(subjectName)) {
                subjectsAndMarksMap.put(subjectName, marks
                        .stream()
                        .filter(m-> m
                                .getLesson()
                                .getSubjectDTO()// дойче телеком не одобяэ
                                .getSubjectName().equals(subjectName))
                        .distinct()
                        .collect(Collectors.toList()));
            }
        });

        return subjectsAndMarksMap;
    }

    public MarkDTO setMarkToStudent(MarkDTO mark){
        return null;
    }
}
