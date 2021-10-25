package com.company.group2;

public class Main {
    public static void main(String[] args) {

        VehicleFactory fact=new CarFactory();
        fact.createVehicle();

        System.out.println("===================");

        VehicleFactory fact1=new ShipFactory();
        fact1.createVehicle();

        System.out.println("===================");

        VehicleFactory fact2=new PlaneFactory();
        fact2.createVehicle();
    }
}
