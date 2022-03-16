package com.thymeleafexample.controller;

import com.thymeleafexample.model.Flight;
import com.thymeleafexample.repository.FlightRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String getHome(Model model){

        List<Flight> flightList = FlightRepository.getFlights();

        model.addAttribute("flights", flightList);

        return "index";

    }

}
