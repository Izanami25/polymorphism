package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Child child = new Child();
        child.print();
        shape.print();
        Overr shape1 = new Overr();
        shape1.print();
    }
}