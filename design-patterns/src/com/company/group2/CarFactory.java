package com.company.group2;

public class CarFactory extends VehicleFactory {

    protected boolean vehicleCanGoOnWater(){return false;}
    protected boolean vehicleCanGoOnRoad(){return true;}
    protected boolean vehicleCanFly(){return false;}

    @Override
    protected void addWings() {

    }

    @Override
    protected void addWheels() {
        System.out.println("Wheels added");
    }

    @Override
    protected void addPropeller() {

    }

    @Override
    protected void addHeadLights() {
        System.out.println("Headlights added");
    }

    @Override
    protected void addSignals() {
        System.out.println("Signals added");
    }

    @Override
    protected void createScaffold() {
        System.out.println("Car scaffold created");
    }
}