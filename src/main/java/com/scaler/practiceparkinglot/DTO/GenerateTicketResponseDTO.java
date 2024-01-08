package com.scaler.practiceparkinglot.DTO;

import com.scaler.practiceparkinglot.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateTicketResponseDTO {
    private Ticket ticket ;
    private ResponseStatus responseStatus ;
    private String failureMessage ;

}
