package ThreadPool_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool1 {
    public static void main(String[] args) throws InterruptedException {


        ExecutorService pool1 = Executors.newCachedThreadPool();  // 创建线程池
        ExecutorService pool2 =Executors.newSingleThreadExecutor();  // 创建一个单线程化的线程池,特性：单线程中顺序执行
        ExecutorService pool3 = Executors.newScheduledThreadPool(5);  // 创建一个定长线程池，支持定时及周期性任务执行

//         pool1.submit(new MyRunable());
//         pool1.submit(new MyRunable());

 //       pool2.submit(new MyRunable());
   //     pool2.submit(new MyRunable());

        pool3.submit(new MyRunable());
        pool3.submit(new MyRunable());

     //   pool1.shutdown();
    }
}
