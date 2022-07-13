package com.h2sm.myschool.controllers;

import com.h2sm.myschool.dto.MarkDTO;
import com.h2sm.myschool.services.MarksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController()
@AllArgsConstructor
public class MarksController {
    private MarksService marksService;

    @GetMapping("/{lesson}")
    public List<MarkDTO> getAllMarksForThisLesson(@PathVariable String lesson){
        return marksService.getAllMarksForGivenLesson(lesson);
    }

    @RequestMapping(value = "/marks/all", method = RequestMethod.GET)
    public Map<String, List<MarkDTO>> getAllMarksForThisPerson(){
        return marksService.getAllMarksForGivenStudent();
    }

}
