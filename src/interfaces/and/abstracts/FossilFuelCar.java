package interfaces.and.abstracts;

//implement multiple interfaces
public class FossilFuelCar implements CarInterface, TestInterface{

    private String name;

    public FossilFuelCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Explosion in the cylinder caused the engine to start");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " is moving at " + speed + "mps");
    }

    @Override
    public void printTestName() {

    }
}
