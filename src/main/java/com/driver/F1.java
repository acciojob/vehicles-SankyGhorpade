package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name,4,2,6,isManual,"type1",2);
    }

    public void accelerate(int rate){
        int newSpeed = super.getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            super.stop();
            super.changeGear(1);
        }else if(newSpeed >=1 && newSpeed <=50){
            super.changeGear(1); //gear as 1
        }else if(newSpeed >=51 && newSpeed <=100){
            super.changeGear(2); //gear as 2
        }else if(newSpeed >=101 && newSpeed <=150){
            super.changeGear(3); //gear as 3
        }else if(newSpeed >=151 && newSpeed <=200){
            super.changeGear(4); //gear as 4
        }else if(newSpeed >=201 && newSpeed <=250){
            super.changeGear(5); //gear as 5
        }else{
            super.changeGear(6); //gear as 6
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
