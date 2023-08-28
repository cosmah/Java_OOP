package OOP;

public class Bird {
    private String name;
    private String color;
    private int legs;
    private boolean hasTale;

    //constructor

    public Bird(String name, String color, int legs, boolean hasTale) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.hasTale = hasTale;
    }

    //eating method
    public void eat(String food){
        System.out.println("Eating" + food);
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTale() {
        return hasTale;
    }

    public void setHasTale(boolean hasTale) {
        this.hasTale = hasTale;
    }
}
