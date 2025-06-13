package ThreadPool_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pool2 {
    public static void main(String[] args) {

        ExecutorService pool2 = Executors.newFixedThreadPool(5);  // 创建一个固定大小的线程池
        for (int i = 0; i < 10; i++) {
            pool2.submit(new MyRunable());
        }
        pool2.shutdown();


        long l = System.currentTimeMillis();
        System.out.println(l);

    }
    }
