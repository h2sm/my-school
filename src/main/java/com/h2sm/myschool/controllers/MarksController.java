package com.h2sm.myschool.controllers;

import com.h2sm.myschool.dto.MarkDTO;
import com.h2sm.myschool.services.MarksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/marks")
@AllArgsConstructor
public class MarksController {
    private MarksService marksService;

    @GetMapping("/{lesson}")
    public List<MarkDTO> getAllMarksForThisLesson(@PathVariable String lesson){
        return marksService.getAllMarksForGivenLesson(lesson);
    }

    @GetMapping("/all")
    public List<MarkDTO> getAllMarksForThisPerson(){
//        var userDetails = (SecureUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return marksService.getAllMarksForGivenStudent("ppp");
    }

}
