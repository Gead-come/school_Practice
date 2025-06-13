package school_4;

public class Test implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName()+"hello world");
        }

    }
}
