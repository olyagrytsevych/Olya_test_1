package com.company;

/**
 * Created by olga.grytsevych on 27/04/2016.
 */
public class Student {
    int id;
    String name;

    void insertRecord(int i, String n){
        id = i;
        name = n;
    }

    void displayInfo(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        Student s1 = new Student(); //created object of a class
        Student s2 = new Student();

        s1.insertRecord(1,"Olya");
        s2.insertRecord(2, "Denis");

        s1.displayInfo();
        s2.displayInfo();
    }
}
