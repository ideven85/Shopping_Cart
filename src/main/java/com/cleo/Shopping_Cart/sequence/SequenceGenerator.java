package com.cleo.Shopping_Cart.sequence;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class SequenceGenerator {

    private String firstName,initial,lastName;
    private final AtomicInteger counter=new AtomicInteger();


    public String getSequence(){
        return initial +" " + counter.getAndIncrement() + " " + firstName + " " + lastName;

    }
}
