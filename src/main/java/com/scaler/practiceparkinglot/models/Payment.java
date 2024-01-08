package com.scaler.practiceparkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseEntity{
    private String transID ;
    private PaymentMode paymentMode;
    private int amount ;
    private PaymentStatus paymentStatus ;


}
