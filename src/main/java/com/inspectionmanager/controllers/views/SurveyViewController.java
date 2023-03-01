package com.inspectionmanager.controllers.views;

import com.inspectionmanager.entities.Survey;
import com.inspectionmanager.services.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SurveyViewController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping("surveys/create")
    public String home(){
        return "create";
    }

    @PostMapping("/create")
    public String create(Survey survey){
        surveyService.insert(survey);

        return "redirect:/survey-edit";
    }

    @GetMapping("/survey-edit")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("survey-edit");
        mv.addObject("surveys", surveyService.findAll());

        return mv;
    }


}
