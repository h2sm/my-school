package com.h2sm.myschool.controllers;

import com.h2sm.myschool.dto.TimetableWebDTO;
import com.h2sm.myschool.services.TimetableService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class TimetableController {
    private TimetableService timetableService;

    @GetMapping("/timetable")
    public Map<String, List<TimetableWebDTO>> getTimetable(){
        return timetableService.getTimetableForThisStudent();
    }
}
