package com.lambton;

import java.time.LocalDate;

public class Employee
{
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    protected Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int calcBirthYear(){
        LocalDate currentDate= LocalDate.now();
        int currentYear= currentDate.getYear();
        int birthYear= currentYear-age;
        return birthYear;
    }
    public void printMyData(){

    }


}
