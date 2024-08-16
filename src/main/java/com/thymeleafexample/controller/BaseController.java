package com.thymeleafexample.controller;

<<<<<<< Updated upstream
=======
import com.thymeleafexample.model.dto.AircraftDTO;
import com.thymeleafexample.model.entity.Aircraft;
import com.thymeleafexample.service.FlightComponentsRepositoryServiceInterface;
import lombok.RequiredArgsConstructor;
>>>>>>> Stashed changes
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

<<<<<<< Updated upstream
=======
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



>>>>>>> Stashed changes
    @GetMapping("/login")
    public String getLogin() {
        return "login.html";
    }


}
