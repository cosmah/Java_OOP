package interfaces.and.abstracts.abstracts;

public class TestClass extends TestAbstractClass{
    @Override
    public void printName(String name) {
        super.printName("Name: " + name);
    }
}