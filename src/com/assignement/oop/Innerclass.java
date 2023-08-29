package com.assignement.oop;

public class Innerclass {

    private int age;
    private String color;
    private class TestInnerClass{
        private String name;

        public  TestInnerClass(String name) {
            this.name = name;
        }

        private void printAge(){
            System.out.println("Age is " + age);
        }
    }
}
