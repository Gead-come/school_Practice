package school_4;

public class Thread_1 {
    public static void main(String[] args) {

        Test test = new Test();

        Thread thread = new Thread(test);
        Thread thread1 = new Thread(test);

           thread1.setName("线程1 ");
           thread.setName("线程2 ");

           thread.start();
           thread1.start();

    }
}
