package com.driver;

public class Boat implements WaterVehicle{
    String name;
    int capacity;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public Boat(){

    }

    public Boat(String name,int capacity){
        this.capacity = capacity;
        this.name = name;
    }

    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }
}
