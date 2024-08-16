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

import javax.validation.Valid;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class BaseController {

    private final FlightComponentsRepositoryServiceInterface flightComponentsRepositoryServiceInterface;

    @GetMapping("/home")
    public String getHome(){
        return "home.html";
    }

    @GetMapping("/include/pilot")
    public String getIncludePilot() {
        return "/view_include_pilot/include_pilot.html";
    }

    @GetMapping("/include/aircraft")
    public ModelAndView getIncludeAircraft(ModelAndView modelAndView) {
        modelAndView.getModelMap().addAttribute("aircraft", new AircraftDTO());
        modelAndView.setViewName("/view_include_aircraft/include_aircraft.html");
        return modelAndView;
    }

    @PostMapping("/include/aircraft")
    public ModelAndView createAircraft(@ModelAttribute("aircraft") @Valid AircraftDTO aircraftDTO, ModelAndView modelAndView) {
        modelAndView.getModelMap().addAttribute("aircraft", new AircraftDTO());
        modelAndView.setViewName("/view_include_aircraft/include_aircraft.html");

        flightComponentsRepositoryServiceInterface.buildAircraft(aircraftDTO);

        return modelAndView;
    }

    @GetMapping("/include/flight")
    public String getIncludeFlight() {
        return "/view_include_flight/include_flight.html";
    }


    @GetMapping("/login")
    public String getLogin() {
        return "login.html";
    }


}
