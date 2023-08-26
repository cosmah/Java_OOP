package OOP;

public class Main {
    public static void main(String[] args){
        //create instance of phone class
        Phone iPhone = new Phone();

        //access fields
        iPhone.setName("iPhone 11");
        iPhone.memorySize = 8;
        System.out.println(iPhone.getName());

        iPhone.playMusic("Angels Wings");
        //reuse class
        iPhone.playMusic("Crack");
    }
}
