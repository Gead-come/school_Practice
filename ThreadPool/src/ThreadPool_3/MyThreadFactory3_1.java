package ThreadPool_3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadFactory3_1 implements ThreadFactory {

    private final AtomicInteger  count = new AtomicInteger(1);
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r,"抢票线程"+ count.getAndIncrement());
    }
}
