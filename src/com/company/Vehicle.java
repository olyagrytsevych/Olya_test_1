package com.company;

/**
 * Created by olga.grytsevych on 27/04/2016.
 */
public class Vehicle {

    void run(){
        System.out.println("Vehicle is running");
    }
    //why Bike should be static???
    static class Bike extends Vehicle{

        void run() {
            System.out.println("Bike is running");
        }
    }
    public static void main(String args[]){
        Bike obj = new Bike();
        obj.run();
    }
}
