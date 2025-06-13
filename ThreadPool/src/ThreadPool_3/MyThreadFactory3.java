package ThreadPool_3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadFactory3 implements ThreadFactory {
    private final String Nameprefix;
    private final AtomicInteger count = new AtomicInteger(1);

    public MyThreadFactory3(String prefix){
        this.Nameprefix = prefix;
    }

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r,  Nameprefix+"---"+count.getAndIncrement());
    }
}

