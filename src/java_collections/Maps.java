package java_collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args){
        Map<String, String> emailList = new HashMap<>();
        emailList.put("Kenny", "ken@gmail.com");
        emailList.put("Brad", "brad@genome.org");

        //access
        System.out.println(emailList.get("Kenny"));
        //size of map
        System.out.println(emailList.size());

        //remove
        emailList.remove("Kenny");
        System.out.println(emailList.size());

        //contains
        System.out.println(emailList.containsKey("Kenny"));
        System.out.println(emailList.containsValue("brad@genome.org"));

    }
}
