package com.oop.composition;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Renault", "8000");
        Car mercedes = new Car("Mercedes Benz", 2, "Silver", new Engine("Renault", "8000"));
        System.out.println(mercedes.getName());
        //instance of engine
//      //Engine engine = mercedes.getEngine();
        System.out.println("Engine model: " + mercedes.getEngine().getModel());
    }
}

//composition is the way of using different classes inside one class.
