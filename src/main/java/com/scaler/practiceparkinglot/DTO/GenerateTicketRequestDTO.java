package com.scaler.practiceparkinglot.DTO;

import com.scaler.practiceparkinglot.models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenerateTicketRequestDTO {
    private Long gateId ;
    private String vehicleNumber ;
    private VehicleType vehicleType;

}
