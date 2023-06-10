package com.driver;

interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}
// Boat class implementing WaterVehicle interface
class Boat implements WaterVehicle {
    String name;
    int capacity;
    
    // Constructor
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    
    // Implementing the methods of WaterVehicle interface
    public String getVehicleName() {
        return this.name;
    }
    
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
