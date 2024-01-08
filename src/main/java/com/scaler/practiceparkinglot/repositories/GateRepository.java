package com.scaler.practiceparkinglot.repositories;

import com.scaler.practiceparkinglot.models.Gate;
import com.scaler.practiceparkinglot.models.GateType;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Long , Gate> gateStore ;
    public GateRepository(){
        gateStore = new HashMap<>() ;
    }
    public void addGate(Long gateId , GateType type){
        gateStore.put(gateId , new Gate(gateId, type) ) ;
    }

    public Gate getGate(Long gateId) {
        return gateStore.get(gateId) ;
    }
}
