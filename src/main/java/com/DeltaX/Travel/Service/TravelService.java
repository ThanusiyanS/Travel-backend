package com.DeltaX.Travel.Service;

import com.DeltaX.Travel.Entity.Travel;

import java.util.List;

public interface TravelService {
    public Travel saveTravel(Travel travel);
    public List<Travel> getAllRecords();

}
