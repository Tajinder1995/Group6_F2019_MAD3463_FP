package com.lambton;

public class PartTime
{


        private float rate;
        private float hoursWorked;
    public PartTime(String name, int age, float rate, float hoursWorked) {
        super(name, age);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }
    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

}
