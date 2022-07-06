package com.h2sm.myschool.controllers;

import com.h2sm.myschool.dto.MarkDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/marks")
public class MarksController {

    @GetMapping("/subject/{subject}")
    public List<MarkDTO> getAllMarksForThisSubjectForStudent(String subject){
        return null;
    }

}
