package com.company;

/**
 * Created by olga.grytsevych on 27/04/2016.
 */

// A class implements interface but one interface extends another interface .

interface Printable2{
    void print_1();
}

interface Readable2 extends Printable2{
    void read_1();
}

public class Interface2 implements Readable2{
    public void print_1(){
        System.out.println("Print 2");
    }

    public void read_1() {
        System.out.println("Read 2");
    }

    public static void main(String args[]){
        Interface2 obj = new Interface2();
        obj.print_1();
        obj.read_1();
    }
}
