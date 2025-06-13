package ThreadPool_2;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadFactory implements ThreadFactory {
    private final String name;
    private final AtomicInteger count  = new AtomicInteger(1);

    public MyThreadFactory(String jj) {
        this.name = jj;
    }
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setName(name + " - " + count.getAndIncrement());  //getAndIncrement 的作用 : 获取并自增
        return t;
    }
}
class MyThreadFactory1 implements ThreadFactory {

        private AtomicInteger count = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "日志线程-" + count.getAndIncrement());
        }
    };




