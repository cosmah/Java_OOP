package singleton;
//ensure one instance of a database class
public class Database {
    private String name;
    private static Database instance;

    public static synchronized Database getInstance(String name) {
        if (null == instance) {
            instance = new Database(name);
            return instance;
        }else {
            return instance;
        }
    }

    //limit access to database constructor
    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //override

    @Override
    public String toString() {
        String text = "Database class \n" + "Name: " + this.name;
        return text;
    }
}
