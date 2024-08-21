package com.thymeleafexample.controller;

import com.thymeleafexample.service.FetchFlightDataInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/flight")
public class FlightsController {

    @Autowired
    private FetchFlightDataInterface fetchFlightDataInterface;

    @GetMapping("/flights")
    public ModelAndView getFlights(ModelAndView model){
        model.addObject("flights", fetchFlightDataInterface.fetch());
        model.setViewName("view_flights/flights.html");
        return model;
    }

    @GetMapping
    public ModelAndView getFlight(ModelAndView modelAndView) {
        modelAndView.addObject("flightDTO", new Object());
        modelAndView.setViewName("/view_include_flight/include_flight.html");

        return modelAndView;
    }

}
