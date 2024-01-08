package com.scaler.practiceparkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle extends BaseEntity{
    private String vehicleNumber ;
    private VehicleType vehicleType;

    public Vehicle(String vehicleNumber, VehicleType type) {
        super();
        this.vehicleNumber = vehicleNumber ;
        this.vehicleType = type ;
    }
}
