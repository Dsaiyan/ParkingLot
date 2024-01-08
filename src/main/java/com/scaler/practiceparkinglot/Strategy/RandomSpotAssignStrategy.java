package com.scaler.practiceparkinglot.Strategy;

import com.scaler.practiceparkinglot.models.Gate;
import com.scaler.practiceparkinglot.models.ParkingSpot;
import com.scaler.practiceparkinglot.models.ParkingSpotStatus;
import com.scaler.practiceparkinglot.models.Vehicle;

import java.util.List;

public class RandomSpotAssignStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot assignSpot(Vehicle vehicle, Gate gate,
                                  List<ParkingSpot> parkingSpotList) {
        for( ParkingSpot parkingSpot : parkingSpotList){
            if( parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
                parkingSpot.getSupportedVehicleType().contains(vehicle.getVehicleType()) ){

                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);

                return parkingSpot ;
            }
        }
        return null;
    }
}
