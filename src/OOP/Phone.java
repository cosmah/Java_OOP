package OOP;

public class Phone {
    //class properties, not instantiated so that it can be reused
    //make name property only accessible in that class
    private String name;
    int screenSize;
    int memorySize;
    int camera;


    /*
    by defining methods you can hev behaviours for our classes
     */
    public void playMusic(String trackName){

        System.out.println("Playing " + trackName);
    }

    //give access to name(setter)
    public void setName(String name){

        this.name = name;
    }

    //give value(getter method)
    public  String getName(){

        return this.name;
    }
}
