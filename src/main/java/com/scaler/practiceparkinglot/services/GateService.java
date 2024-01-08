package com.scaler.practiceparkinglot.services;

import com.scaler.practiceparkinglot.models.Gate;
import com.scaler.practiceparkinglot.models.GateType;
import com.scaler.practiceparkinglot.repositories.GateRepository;

public class GateService {
    private GateRepository gateRepository ;

    public Gate getGate(Long gateId){
        return gateRepository.getGate(gateId);
    }
    public void addGate(Long gateId , GateType type){
        gateRepository.addGate(gateId , type);
    }

}
