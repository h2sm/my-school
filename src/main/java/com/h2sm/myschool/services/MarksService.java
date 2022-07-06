package com.h2sm.myschool.services;

import com.h2sm.myschool.dto.MarkDTO;
import com.h2sm.myschool.dto.PersonDTO;
import com.h2sm.myschool.enums.Position;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksService {

    public List<MarkDTO> getAllMarksForGivenSubject(String subject){

        return null;
    }

    public List<MarkDTO> getAllMarksForGivenStudent(PersonDTO student){
        if (student.getPosition().equals(Position.STUDENT)){

        }

        return null;
    }

    public List<MarkDTO> getAllMarksForGivenStudent(long studentID){

        return null;
    }

    public MarkDTO setMarkToStudent(MarkDTO mark){
        return null;
    }
}
