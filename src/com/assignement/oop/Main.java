package com.assignement.oop;

public class Main {
    public static void main(String[] args){
//static calls
        TestClass.name = "Mesiah";

        TestClass testClass = new TestClass(26, "White");
        System.out.println("Name: " + testClass.getName());

        TestClass.printSomething();

        //inner class calls


    }
}


//non static fields can not be referenced from a static field