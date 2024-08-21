package com.thymeleafexample.controller;

import com.thymeleafexample.model.dto.PilotDTO;
import com.thymeleafexample.service.FlightComponentsRepositoryServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/pilot")
@RequiredArgsConstructor
public class PilotController {

    private final FlightComponentsRepositoryServiceInterface flightComponentsRepositoryServiceInterface;

    @GetMapping
    public ModelAndView getPilot(ModelAndView modelAndView) {
        modelAndView.setViewName("/view_include_pilot/include_pilot.html");
        modelAndView.addObject("pilotDTO", new PilotDTO());

        return modelAndView;
    }

    @PostMapping
    public ModelAndView insertPilot(ModelAndView modelAndView, @ModelAttribute("pilotDTO") @Valid PilotDTO pilotDTO) {
        modelAndView.setViewName("/view_include_pilot/include_pilot.html");
        modelAndView.addObject("pilotDTO", new PilotDTO());

        flightComponentsRepositoryServiceInterface.createPilot(pilotDTO);

        return modelAndView;
    }

}
