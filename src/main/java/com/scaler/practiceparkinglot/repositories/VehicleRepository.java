package com.scaler.practiceparkinglot.repositories;

import com.scaler.practiceparkinglot.models.Vehicle;
import com.scaler.practiceparkinglot.models.VehicleType;
import com.scaler.practiceparkinglot.services.VehicleService;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    // we will use a Map as DB in this class to add or get Vehicle

    private Map<String , Vehicle> vehicleStore ;

    public VehicleRepository(){
        this.vehicleStore = new HashMap<>() ;
    }
    public Vehicle addVehicle(Vehicle vehicle){
        vehicleStore.put( vehicle.getVehicleNumber() ,vehicle) ;
        return vehicle;
    }
    public Vehicle getVehicle(String number){
        return vehicleStore.get(number) ;
    }
}
