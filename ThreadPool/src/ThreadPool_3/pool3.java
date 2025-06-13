package ThreadPool_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class pool3 {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> person = Collections.synchronizedList(new ArrayList<>());
        List<Integer> person1 = Collections.synchronizedList(new ArrayList<>());

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                5,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(20),
              new MyThreadFactory3("抢票线程"),
               // new MyThreadFactory3_1(),
                new ThreadPoolExecutor.AbortPolicy()

        );
        for (int i = 0; i < 25; i++) {
            pool.execute(new test(person,person1,i));
        }
        pool.shutdown();
        pool.awaitTermination(50, TimeUnit.SECONDS);
        System.out.println("======================================");

        System.out.println("🎉 抢票成功用户编号列表："+person );

        System.out.println("抢票失败用户编号列表："+person1);
        pool.shutdown();
//        boolean terminated = pool.awaitTermination(10, TimeUnit.SECONDS); // 延长等待时间
//        if (!terminated) {
//            System.out.println("⚠️ 线程池未在规定时间内终止");
//        }
//        System.out.println("🎉 抢票成功用户编号列表：" + person);

    }
}
