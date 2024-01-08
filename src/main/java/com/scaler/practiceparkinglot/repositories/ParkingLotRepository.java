package com.scaler.practiceparkinglot.repositories;

import com.scaler.practiceparkinglot.models.ParkingSpot;

import java.util.List;

public class ParkingLotRepository {

    public List<ParkingSpot> parkingSpotList ;

    public List<ParkingSpot> getAllParkingSpot(){

        return parkingSpotList ;
    }

}
