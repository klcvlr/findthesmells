package com.zenika.findthesmells.smell4;

public class ElectricCar extends Vehicle {

    @Override
    public void refuel() {
       throw new UnsupportedOperationException("Electric car charged.");
    }

    public void chargeBattery() {
        System.out.println("Electric car charged.");
    }

}
