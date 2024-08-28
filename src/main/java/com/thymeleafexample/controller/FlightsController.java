package com.thymeleafexample.controller;

import com.thymeleafexample.model.dto.FlightDTO;
import com.thymeleafexample.model.dto.flightscreen.FlightScreenDTO;
import com.thymeleafexample.service.FetchFlightDataInterface;
import com.thymeleafexample.service.FlightComponentsRepositoryServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/flight")
public class FlightsController {


    private final FetchFlightDataInterface fetchFlightDataInterface;
    private final FlightComponentsRepositoryServiceInterface flightComponentsRepositoryServiceInterface;

    @GetMapping("/flights")
    public ModelAndView getFlights(ModelAndView model){
        model.addObject("flights", fetchFlightDataInterface.fetch());
        model.setViewName("view_flights/flights.html");
        return model;
    }

    @GetMapping
    public ModelAndView getFlight(ModelAndView modelAndView) {
        FlightScreenDTO flightScreenDTO = flightComponentsRepositoryServiceInterface.fetchFlightScreenData();

        modelAndView.addObject("flightViewDTO", flightScreenDTO);
        modelAndView.addObject("flightDTO", new FlightDTO());
        modelAndView.setViewName("/view_include_flight/include_flight.html");

        return modelAndView;
    }

}
