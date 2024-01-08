package com.scaler.practiceparkinglot.services;

import com.scaler.practiceparkinglot.Strategy.SpotAssignmentStrategy;
import com.scaler.practiceparkinglot.exceptions.NoParkingSpotFoundException;
import com.scaler.practiceparkinglot.models.*;
import com.scaler.practiceparkinglot.repositories.TicketRepository;
import com.scaler.practiceparkinglot.repositories.VehicleRepository;

import java.util.Date;

public class TicketService {

    private VehicleService vehicleService ;
    private GateService gateService ;
    private ParkingSpotService parkingSpotService ;
    private TicketRepository ticketRepository ;
    private SpotAssignmentStrategy spotAssignmentStrategy ;
    private ParkingLotService parkingLotService ;

    public Ticket generateTicket(String vehicleNumber, VehicleType vehicleType,
                                 Long gateId) throws NoParkingSpotFoundException {
        //flow

        //1. get the vehicle from the DB using vehicle number if available
        //2. else register the vehicle
        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber) ;
        if( vehicle == null){
            vehicle = vehicleService.registerVehicle(vehicleNumber,vehicleType);
        }

        Gate gate = gateService.getGate(gateId) ;

        //3. assign a parking spot

        ParkingSpot parkingSpot = parkingLotService.getParkingSpot(vehicle , gate) ;
        if( parkingSpot == null ){
            throw new NoParkingSpotFoundException("No ParkingSpot available") ;
        }

        //4. update the parking spot as occupied in the system
        parkingSpot = parkingSpotService.updateParkingSpot(parkingSpot) ;

        //5. generate the ticket
        Ticket ticket = new Ticket() ;
        ticket.setVehicle(vehicle);
        ticket.setGate(gate);
        ticket.setParkingSpot(parkingSpot);
        ticket.setOperator(gate.getOperator());
        ticket.setEntryTime(new Date());

        //6. save the ticket
        ticketRepository.saveTicket(ticket) ;


        return ticket ;
    }
}
