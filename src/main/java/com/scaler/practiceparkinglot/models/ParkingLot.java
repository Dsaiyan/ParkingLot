package com.scaler.practiceparkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseEntity{
    private String address ;
    private List<ParkingFloor> parkingFloorList;
    private List<Gate> gateList ;



}
