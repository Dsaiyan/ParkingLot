package com.scaler.practiceparkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingSpot extends BaseEntity{

    private int spotNumber ;
    private ParkingSpotStatus parkingSpotStatus ;
    private VehicleType vehicleType;
    private ParkingFloor parkingFloor ;
    public List<VehicleType> supportedVehicleType;

}
