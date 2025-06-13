package Thead_1;

public class Thead_1 {
    public static void main(String[] args) throws InterruptedException {

         MyThead1 gg = new MyThead1("自転車");
         MyThead1  gt = new MyThead1("自DB車");

        Thread thread = new Thread(gg);
        Thread thread1 = new Thread(gt);

        int priority = thread1.getPriority();    // 获取优先级 cup最大10 最小1，默认5
        System.out.println(priority);
        int priority1 = thread.getPriority();
        System.out.println(priority1);

        thread.setPriority(10);  // 设置优先级
        thread1.setPriority(1);
        thread.start();
        thread1.start();
     //   thread1.setDaemon(true); // 设置守护线程
        thread1.yield();  // 线程礼让
        thread1.join();   // 插入线程




        Thread.currentThread().setName("主线程");


    }
    }
