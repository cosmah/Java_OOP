package concurrency;

public class Main {

    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<5; i++){
                    System.out.println("Printing " + i + " in working thread");
                    //time lapse
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();

        for (int i = 0; i<5; i++){
            System.out.println("Printing " + i + " in main thread");
            //time lapse
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
