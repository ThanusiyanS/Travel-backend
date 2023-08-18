package com.DeltaX.Travel.Service;

import com.DeltaX.Travel.Entity.Travel;
import com.DeltaX.Travel.Repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelServiceImplement implements TravelService{

    @Autowired
    private TravelRepository travelRepository;
    @Override
    public Travel saveTravel(Travel travel) {
        return travelRepository.save(travel);
    }

    @Override
    public List<Travel> getAllRecords() {
        return travelRepository.findAll();
    }
}
