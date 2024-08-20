package com.thymeleafexample.controller;

import com.thymeleafexample.model.dto.PilotDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pilot")
@RequiredArgsConstructor
public class PilotController {

    @GetMapping
    public ModelAndView getPilot(ModelAndView modelAndView) {
        modelAndView.setViewName("/view_include_pilot/include_pilot.html");
        modelAndView.addObject("pilot", new PilotDTO());

        return modelAndView;
    }


}
