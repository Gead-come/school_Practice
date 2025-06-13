package interAddrese.tcp6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadFactory6 implements ThreadFactory {
    private String prefix;
    private AtomicInteger count = new AtomicInteger(0);
    public MyThreadFactory6(String name) {
        this.prefix  = name;
    }

    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r,  prefix + " - " + count.getAndIncrement());
    }
}
