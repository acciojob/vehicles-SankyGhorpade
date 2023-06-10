package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private int currentGear;
    private int seats;

    //constructor
    public Car(String name, int wheels, int doors, int gears, String type, int seats, int currentGear) {
        super(name);
        this.currentGear = currentGear;
        //Hint: Car extends Vehicle
    }

    public void changeGear(int newGear){
         this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
