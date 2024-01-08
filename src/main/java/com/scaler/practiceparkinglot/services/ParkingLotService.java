package com.scaler.practiceparkinglot.services;

import com.scaler.practiceparkinglot.Strategy.SpotAssignmentStrategy;
import com.scaler.practiceparkinglot.models.Gate;
import com.scaler.practiceparkinglot.models.ParkingLot;
import com.scaler.practiceparkinglot.models.ParkingSpot;
import com.scaler.practiceparkinglot.models.Vehicle;
import com.scaler.practiceparkinglot.repositories.ParkingLotRepository;

import java.util.List;

public class ParkingLotService {
    private SpotAssignmentStrategy spotAssignmentStrategy ;
    private ParkingLotRepository parkingLotRepository ;



    public ParkingSpot getParkingSpot(Vehicle vehicle, Gate gate) {

        List<ParkingSpot> parkingSpotList = parkingLotRepository.getAllParkingSpot() ;
        return spotAssignmentStrategy.assignSpot(vehicle,gate,parkingSpotList) ;
    }
}
