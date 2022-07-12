package com.h2sm.myschool.controllers;

import com.h2sm.myschool.dto.MarkDTO;
import com.h2sm.myschool.services.MarksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@AllArgsConstructor
public class MarksController {
    private MarksService marksService;

    @GetMapping("/{lesson}")
    public List<MarkDTO> getAllMarksForThisLesson(@PathVariable String lesson){
        return marksService.getAllMarksForGivenLesson(lesson);
    }

    @RequestMapping(value = "/marks/all", method = RequestMethod.GET)
    public List<MarkDTO> getAllMarksForThisPerson(){
        return marksService.getAllMarksForGivenStudent();
    }

}
