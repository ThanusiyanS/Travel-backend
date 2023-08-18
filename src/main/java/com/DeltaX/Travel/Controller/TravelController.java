package com.DeltaX.Travel.Controller;

import com.DeltaX.Travel.Entity.Travel;
import com.DeltaX.Travel.Service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/travel")
@CrossOrigin(origins = "http://localhost:3000")
public class TravelController {

    @Autowired
    private TravelService travelService;

    @PostMapping("/add")
    public String add(@RequestBody Travel travel){
        travelService.saveTravel(travel);
        return "New Travel record added";
    }


    @GetMapping("/getAll")
    public List<Travel> getAllRecords(){
        return travelService.getAllRecords();
    }
}
