package com.inspectionmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

    @GetMapping("surveys/create")
    public String create(){
        return "surveys/create";
    }
}
