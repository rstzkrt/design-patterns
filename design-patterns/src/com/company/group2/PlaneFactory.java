package com.company.group2;

public class PlaneFactory extends VehicleFactory {


    @Override
    protected void addWings() {
        System.out.println("Wings added");
    }

    @Override
    protected void addWheels() {

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
        System.out.println("Plane scaffold created");
    }
}
