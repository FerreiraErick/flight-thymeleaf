package com.thymeleafexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String getIncludeAircraft() {
        return "/view_include_aircraft/include_aircraft.html";
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
