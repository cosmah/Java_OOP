package OOP;

public class Main {
    public static void main(String[] args){
        //create instance of phone class

        Phone iPhone = new Phone();
        //Phone iPhone = new Phone("iPhone", 5, 120, 8); for the constructor

        //access fields
        iPhone.setName("iPhone 11");
        iPhone.setMemorySize(120);
        System.out.println(iPhone.getName());
        System.out.println(iPhone.getMemorySize() + "GB");


        iPhone.playMusic("Angels Wings");
        //reuse class
        iPhone.playMusic("Crack");

        System.out.println("=========INHERITANCE===========");
        Bird phoenix = new Bird("Nina", "Golden", 2, true, 2);
        System.out.println(phoenix.getWings());

        phoenix.eat("meat");
        phoenix.fly();

    }
}

//polymorphism is where a class has multiple constructors













