package com.thymeleafexample.controller;

import com.thymeleafexample.model.dto.AircraftDTO;
import com.thymeleafexample.model.entity.Aircraft;
import org.springframework.stereotype.Controller;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class BaseController {

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

    @GetMapping("/include/flight")
    public String getIncludeFlight() {
        return "/view_include_flight/include_flight.html";
    }

    @PostMapping("/include/aircraft")
    public ModelAndView createAircraft(@ModelAttribute("aircraft") @Valid AircraftDTO aircraftDTO, ModelAndView modelAndView) {
        modelAndView.getModelMap().addAttribute("aircraft", new AircraftDTO());
        modelAndView.setViewName("/view_include_aircraft/include_aircraft.html");

        return modelAndView;
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login.html";
    }


}
