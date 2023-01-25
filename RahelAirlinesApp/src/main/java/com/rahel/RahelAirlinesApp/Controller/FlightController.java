package com.rahel.RahelAirlinesApp.Controller;

import com.rahel.RahelAirlinesApp.Model.Flight;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class FlightController {
    @GetMapping("/search")
    public List<Flight> searchFlight(String departingCity, String destinationCity, LocalDate departingDate){
        return  null;
    }
@GetMapping("/flight")
    public  Flight reserveFlight(){
        return  null;
    }

}
