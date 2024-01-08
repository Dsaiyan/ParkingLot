package com.scaler.practiceparkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gate extends BaseEntity {
    private GateType gateType ;
    private Long gateNumber ;
    private Operator operator ;
    private GateStatus gateStatus ;

    public Gate(Long gateId, GateType type) {
        super();
        this.gateNumber = gateId ;
        this.gateType = type ;
    }
}
