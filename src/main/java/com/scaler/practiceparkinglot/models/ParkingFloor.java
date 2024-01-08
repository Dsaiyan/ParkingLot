package com.scaler.practiceparkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingFloor extends BaseEntity{
    private int floorNumber ;
    private List<ParkingSpot> parkingSpotList ;
    private ParkingFloorStatus parkingFloorStatus ;
}
