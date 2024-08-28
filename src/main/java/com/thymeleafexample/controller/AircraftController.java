package com.thymeleafexample.controller;

import com.thymeleafexample.model.dto.AircraftDTO;
import com.thymeleafexample.service.FlightComponentsRepositoryServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/aircraft")
@RequiredArgsConstructor
public class AircraftController {

    private final FlightComponentsRepositoryServiceInterface flightComponentsRepositoryServiceInterface;

    @GetMapping()
    public ModelAndView getIncludeAircraft(ModelAndView modelAndView) {
        modelAndView.getModelMap().addAttribute("aircraft", new AircraftDTO());
        modelAndView.setViewName("/view_include_aircraft/include_aircraft.html");
        return modelAndView;
    }

    @PostMapping()
    public ModelAndView createAircraft(@ModelAttribute("aircraft") @Valid AircraftDTO aircraftDTO, ModelAndView modelAndView) {
        modelAndView.getModelMap().addAttribute("aircraft", new AircraftDTO());
        modelAndView.setViewName("/view_include_aircraft/include_aircraft.html");

        flightComponentsRepositoryServiceInterface.createAircraft(aircraftDTO);

        return modelAndView;
    }


}
