package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual, int currentGear) {
         super(name, currentGear);
        this.isManual = isManual;
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
           int newSpeed = super.currentSpeed + rate;
        if (newSpeed <= 250) {
            super.currentSpeed = newSpeed;
             if (newSpeed <= 50)
                super.currentGear = 1;
            else if (newSpeed <= 100)
                super.currentGear = 2;
            else if (newSpeed <= 150)
                super.currentGear = 3;
            else if (newSpeed <= 200)
                super.currentGear = 4;
            else if (newSpeed <= 250)
                super.currentGear = 5;
        }
        else {
            super.currentGear = 6;
        }
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            super.currentGear = 1;
            //Stop the car, set gear as 1
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
