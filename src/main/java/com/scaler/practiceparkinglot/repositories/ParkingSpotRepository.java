package com.scaler.practiceparkinglot.repositories;

import com.scaler.practiceparkinglot.models.ParkingSpot;
import com.scaler.practiceparkinglot.models.ParkingSpotStatus;

import java.util.Map;

public class ParkingSpotRepository {
    Map< Long , ParkingSpot > parkingSpotStore ;
    public void update(ParkingSpot parkingSpot){
        parkingSpotStore.put(parkingSpot.getId() ,parkingSpot) ;
    }
}
