package ThreadPool_3;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class test implements Runnable{
    private static final AtomicInteger  tickets = new AtomicInteger(10);
    private final List<Integer> person;
    private final List<Integer> person2;
    private int id;

    public test(List<Integer> person, List<Integer> person2, int id) {
        this.person = person;
        this.person2 = person2;
        this.id = id;
    }

    @Override
    public void run() {

            int re = tickets.getAndDecrement();
            if (re > 0){
                System.out.println(Thread.currentThread().getName()+
                        "用户"+id +" 抢到了第" + re + "张票 ✅");
                person.add(id);
            }else {
                System.out.println(Thread.currentThread().getName()+
                        " 用户" + id + " 很遗憾，票已售罄 ❌");
                person2.add(id);
            }
        }

    }

