package OOP;

public class Phone {
    //class properties, not instantiated so that it can be reused
    //make name property only accessible in that class
    private String name;
    private int screenSize;
    private int memorySize;
    private int camera;



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

    //screen size
    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }

    public int getScreenSize(){
        return this.screenSize;
    }

    //memory
    public void setMemorySize(int memorySize){
        this.memorySize = memorySize;
    }

    public int getMemorySize(){
        return this.memorySize;
    }

    //camera
    public void setCamera(int camera){
        this.camera = camera;
    }

}
