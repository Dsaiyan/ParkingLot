package com.scaler.practiceparkinglot.Strategy;

import com.scaler.practiceparkinglot.models.Gate;
import com.scaler.practiceparkinglot.models.ParkingSpot;
import com.scaler.practiceparkinglot.models.Vehicle;

import java.util.List;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(Vehicle vehicle , Gate gate , List<ParkingSpot> parkingSpotList ) ;
}
