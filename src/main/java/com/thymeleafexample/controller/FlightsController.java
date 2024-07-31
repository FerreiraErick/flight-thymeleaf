package com.thymeleafexample.controller;

import com.thymeleafexample.service.FetchFlightDataInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/flights")
public class FlightsController {

    @Autowired
    private FetchFlightDataInterface fetchFlightDataInterface;

    @GetMapping
    public ModelAndView getHome(ModelAndView model){
        model.addObject("flights", fetchFlightDataInterface.fetch());
        model.setViewName("view_flights/flights.html");
        return model;
    }

}
