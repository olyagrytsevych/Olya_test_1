package com.company;

/**
 * Created by olga.grytsevych on 27/04/2016.
 */

interface Printable{
    void print_1();
}

interface Readable{
    void read_1();
}
//Multiple inheritance
class Interf implements Printable, Readable {
    public void print_1(){
        System.out.println("Hello");
    }
    public void read_1(){
        System.out.println("Read");
    }
}

public class Interface1 {
    public static void main(String args[]) {
        Interf obj = new Interf();
        obj.print_1();
        obj.read_1();
    }
}



