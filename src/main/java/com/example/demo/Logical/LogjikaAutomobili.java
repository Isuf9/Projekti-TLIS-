package com.example.demo.Logical;
import com.example.demo.Model.Automobili;

public class LogjikaAutomobili implements KlasifokoAutomjetet {
    @Override
    public void roliAutomjetei(String nrTargat) {
        System.out.println("Makina me trgat:"+nrTargat+", eshte dedektuar");
    }
}
