package java_collections;

import java.util.ArrayList;
import java.util.List;


//Integer,Boolean,Long,Double
public class Main {
    public static void main(String[] args){
//changing the size of array list
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Gift");


        names.add("Jelly");
        System.out.println(names.size());
        System.out.println(names.get(2));
        System.out.println(names);

        //remove elements
        names.remove("Gift");
        System.out.println(names.size());

        //check if it contains an element
        System.out.println(names.contains("John"));

        //print index of an object
        System.out.println(names.indexOf("Jelly"));

        //using loops to iterate
        for (int i=0; i<names.size(); i++){
            System.out.println("This is " + names.get(i));
        }


        //use clear() method to remove all array elements
        names.clear();
        System.out.println(names.size());

        //check if its empty
        System.out.println(names.isEmpty());
    }

}
