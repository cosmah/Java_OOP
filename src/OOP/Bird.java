package OOP;

//inherit from animal(animal is parent class)
public class Bird extends Animal {

    //add wing property
    private int wings;

    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }

    //override eat method
    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println(this.getName() + " has finished eating.");
    }

    public void fly(){
        System.out.println(this.getName() + " is flying with " + getWings() + " wings.");
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
