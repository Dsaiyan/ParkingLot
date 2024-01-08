package com.scaler.practiceparkinglot.repositories;

import com.scaler.practiceparkinglot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    Map<Long , Ticket> ticketStore ;
    public TicketRepository(){
        this.ticketStore = new HashMap<>() ;
    }

    public void saveTicket( Ticket ticket){
        ticketStore.put(ticket.getId() , ticket ) ;
    }
}
