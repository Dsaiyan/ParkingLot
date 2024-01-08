package com.scaler.practiceparkinglot.services;

import com.scaler.practiceparkinglot.models.Vehicle;
import com.scaler.practiceparkinglot.models.VehicleType;
import com.scaler.practiceparkinglot.repositories.VehicleRepository;

public class VehicleService {

    private VehicleRepository vehicleRepository ;

    public Vehicle getVehicle(String vehicleNumber ) {
        return vehicleRepository.getVehicle(vehicleNumber);
    }
    public Vehicle registerVehicle(String vehicleNumber, VehicleType type){
        return  vehicleRepository.addVehicle(new Vehicle(vehicleNumber,type) );
    }
}
