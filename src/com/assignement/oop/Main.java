package com.assignement.oop;

public class Main {
    public static void main(String[] args){

        TestClass.name = "Mesiah";

        TestClass testClass = new TestClass(26, "White");
        System.out.println("Name: " + testClass.getName());

        TestClass.printSomething();

    }
}
