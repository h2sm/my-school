package com.h2sm.myschool.services;

import com.h2sm.myschool.mapper.MarkSwapper;
import com.h2sm.myschool.dto.MarkDTO;
import com.h2sm.myschool.repository.MarkRepository;
import com.h2sm.myschool.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MarksService {
    private MarkRepository markRepository;
    private PersonRepository personRepository;
    private MarkSwapper markSwapper;

    public List<MarkDTO> getAllMarksForGivenLesson(String subject){
        return null;
    }

    public List<MarkDTO> getAllMarksForGivenStudent(String studentEmail){
        var desiredPerson = personRepository.findPersonEntityByEmail(studentEmail).orElseThrow(()-> new UsernameNotFoundException("No such person"));
        return markRepository.findByStudentEquals(desiredPerson)
                .stream()
                .map(mark -> markSwapper.entityToDTO(mark))
                .collect(Collectors.toList());
    }

    public MarkDTO setMarkToStudent(MarkDTO mark){
        return null;
    }
}
