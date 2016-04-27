package com.company;

/**
 * Created by olga.grytsevych on 27/04/2016.
 */
public class Vehicle1 {
    int getVehicleId(){
        return 0;
    }
}

class Bike extends Vehicle1{
    int getVehicleId(){
        return 1;
    }
}

class Motorcycle extends Vehicle1{
    int getVehicleId(){
        return 2;
    }
}

class Car extends Vehicle1{
    int getVehicleId(){
        return 3;
    }
}

class Test{
    public static void main(String args[]){
        Bike b = new Bike();
        Motorcycle m = new Motorcycle();
        Car c = new Car();

        System.out.println("Id of a bike = "+b.getVehicleId());
        System.out.println("Id of a motorcycle = "+m.getVehicleId());
        System.out.println("Id of a car = "+c.getVehicleId());
    }
}