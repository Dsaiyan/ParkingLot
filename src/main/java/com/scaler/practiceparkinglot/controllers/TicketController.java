package com.scaler.practiceparkinglot.controllers;

import com.scaler.practiceparkinglot.DTO.GenerateTicketRequestDTO;
import com.scaler.practiceparkinglot.DTO.GenerateTicketResponseDTO;
import com.scaler.practiceparkinglot.DTO.ResponseStatus;
import com.scaler.practiceparkinglot.exceptions.NoParkingSpotFoundException;
import com.scaler.practiceparkinglot.models.Ticket;
import com.scaler.practiceparkinglot.services.TicketService;

public class TicketController {

    //DTO -> Data Transfer Object which wraps around the object that client need to provide
    //  to the system
    // Problems
    //  1: if we add/remove models from input, the client will start falling
    //  2: we should not show model details to the client for privacy
    // The DTO should name as request DTO or response Dto

    private TicketService ticketService ;
    public GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO generateTicketRequestDTO ){
        try{
            GenerateTicketResponseDTO generateTicketResponseDTO = new GenerateTicketResponseDTO() ;

            Ticket ticket = ticketService.generateTicket(
                    generateTicketRequestDTO.getVehicleNumber(),
                    generateTicketRequestDTO.getVehicleType(),
                    generateTicketRequestDTO.getGateId() );

            generateTicketResponseDTO.setTicket(ticket) ;
            generateTicketResponseDTO.setResponseStatus(ResponseStatus.Success);

            return generateTicketResponseDTO ;
        }
        catch (NoParkingSpotFoundException e){
            GenerateTicketResponseDTO generateTicketResponseDTO = new GenerateTicketResponseDTO() ;
            generateTicketResponseDTO.setResponseStatus(ResponseStatus.Failure);
            generateTicketResponseDTO.setFailureMessage(e.getMessage());

            return generateTicketResponseDTO ;
        }

    }
}
