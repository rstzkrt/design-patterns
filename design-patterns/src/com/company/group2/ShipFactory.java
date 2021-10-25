package com.company.group2;

public class ShipFactory extends VehicleFactory{


    protected boolean vehicleCanGoOnWater(){return true;}
    protected boolean vehicleCanGoOnRoad(){return false;}
    protected boolean vehicleCanFly(){return false;}

    @Override
    protected void addWings() {

    }

    @Override
    protected void addWheels() {

    }

    @Override
    protected void addPropeller() {
        System.out.println("Propeller added");
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
        System.out.println("Ship scaffold created");
    }
}
