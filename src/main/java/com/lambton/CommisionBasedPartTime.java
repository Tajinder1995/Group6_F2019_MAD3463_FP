package com.lambton;

public class CommissionBasedPartTime extends PartTime implements IPrintable
    {
        float commissionPercentage;
        public CommissionBasedPartTime(String name, int age, float rate, float hoursWorked, float commissionPercentage) {
            super(name, age, rate, hoursWorked);
            this.commissionPercentage=commissionPercentage;
        }

        public float getCommissionPercentage() {
            return commissionPercentage;
        }




}
