package com.scaler.practiceparkinglot.services;

import com.scaler.practiceparkinglot.models.ParkingSpot;
import com.scaler.practiceparkinglot.repositories.ParkingSpotRepository;

public class ParkingSpotService {
    private ParkingSpotRepository parkingSpotRepository ;
    private ParkingSpot parkingSpot ;

    public ParkingSpot assignParkingSpot() {
        //implement logic
        return null ;
    }


    public ParkingSpot updateParkingSpot(ParkingSpot parkingSpot) {
        parkingSpotRepository.update(parkingSpot);
        return parkingSpot ;
    }
}
