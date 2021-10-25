package com.company.group2;

public abstract class VehicleFactory{

    final void createVehicle(){
        createScaffold();

        if(vehicleCanFly()){
            addWings();
            addWheels();
        }
        if(vehicleCanGoOnWater()){
            addPropeller();
        }
        if(vehicleCanGoOnRoad()){
            addWheels();
        }
        addHeadLights();
        addSignals();
        mergeEverything();
    }

    protected boolean vehicleCanGoOnWater(){return true;}
    protected boolean vehicleCanGoOnRoad(){return true;}
    protected boolean vehicleCanFly(){return true;}

    protected abstract void addWings();

    protected abstract void addWheels();

    protected abstract void addPropeller();

    protected abstract void addHeadLights();

    protected abstract void addSignals();

    protected void mergeEverything(){
        System.out.println("Merge all stuff");
    };

    protected abstract void createScaffold();

}