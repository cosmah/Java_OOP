package concurrency;

public class Integers {
    public static void main(String[] args){
        int a =2;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch (Exception e){
            e.printStackTrace();//for debuging purpose
            System.out.println("B was zero");
        }
    }
}
