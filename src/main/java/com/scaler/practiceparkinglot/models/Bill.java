package com.scaler.practiceparkinglot.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Bill extends BaseEntity{
    private Ticket ticket ;
    private Date exitTime ;
    private int amount ;
    private Operator operator ;
    private List<Payment> paymentList ;
    private BillStatus billStatus ;

}
