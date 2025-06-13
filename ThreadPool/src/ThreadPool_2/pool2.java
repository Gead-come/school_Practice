package ThreadPool_2;

import ThreadPool_1.MyRunable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class pool2 {
    public static void main(String[] args) {

         //自定义线程池的构造方法

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                5,                                  // 线程池核心线程数
                10,                                          // 线程池最大线程数
                60,                                           // 线程池线程空闲时间
                TimeUnit.SECONDS,                              // 时间单位
                new ArrayBlockingQueue<>(5) ,          // 线程队列
             //   Executors.defaultThreadFactory(),           // 创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()
        );                                                    // 拒绝策略

               pool.submit(new MyRunable());
               pool.shutdown();



                ThreadPoolExecutor pool1 = new ThreadPoolExecutor(
                5,                                  // 线程池核心线程数
                10,                                          // 线程池最大线程数
                60,                                           // 线程池线程空闲时间
                TimeUnit.SECONDS,                              // 时间单位
                new ArrayBlockingQueue<>(5) ,          // 线程队列
                //   Executors.defaultThreadFactory(),           // 创建线程工厂
                 new MyThreadFactory1(),
                new ThreadPoolExecutor.AbortPolicy()           // 拒绝策略

        );

                pool1.submit(new MyRunable());
                pool1.shutdown();


    }
}
