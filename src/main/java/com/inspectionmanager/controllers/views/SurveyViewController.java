package com.inspectionmanager.controllers.views;

import com.inspectionmanager.entities.Inspect;
import com.inspectionmanager.services.InspectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SurveyViewController {

    @Autowired
    private InspectService inspectService;

    @GetMapping("surveys/create")
    public String home(){
        return "create";
    }

    @PostMapping("/create")
    public String create(Inspect inspect){
        inspectService.insert(inspect);

        return "redirect:/survey-edit";
    }

    @GetMapping("/survey-edit")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("survey-edit");
        mv.addObject("surveys", inspectService.findAll());

        return mv;
    }


}
