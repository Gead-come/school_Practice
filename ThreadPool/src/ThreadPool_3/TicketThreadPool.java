package ThreadPool_3;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TicketThreadPool {
    // 剩余票数（共享资源）
    private static final AtomicInteger tickets = new AtomicInteger(10);

    public static void main(String[] args) {
        // 自定义线程工厂
        AtomicInteger threadCount = new AtomicInteger(1);
        ThreadFactory factory = r -> new Thread(r, "抢票线程-" + threadCount.getAndIncrement());

        // 自定义线程池
        ExecutorService pool = new ThreadPoolExecutor(
                5, 10, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(20),
                factory,
                new ThreadPoolExecutor.DiscardPolicy() // 超出直接丢弃
        );


        // 模拟100个用户请求抢票
        for (int i = 1; i <= 100; i++) {
            int userId = i;
            pool.execute(() -> {
                int remain = tickets.getAndDecrement();
                if (remain > 0) {
                    System.out.println(Thread.currentThread().getName() +
                            " 用户" + userId + " 抢到第" + remain + "张票 ✅");
                } else {
                    System.out.println(Thread.currentThread().getName() +
                            " 用户" + userId + " 很遗憾，票已售罄 ❌");
                }
            });
        }

        pool.shutdown();
    }
}
