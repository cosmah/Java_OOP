package interfaces.and.abstracts;

public class Main {
    //interface is a contract btn two parts of your application
    public static void main(String[] args){
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(60);

//        List<String> names = new ArrayList<>();
        CarInterface fosilCarInterface = new FossilFuelCar("Mercedes");
        fosilCarInterface.start();
        fosilCarInterface.move(150);
    }
}

//callback interfaces are good for eventlisteners