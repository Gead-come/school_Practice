package school_4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread_2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyThead myThead = new MyThead(100);
        FutureTask<String> ft = new FutureTask<>(myThead);
        Thread thread = new Thread(ft);
        thread.setName("子线程");
        thread.start();
        String s = ft.get();
        System.out.println(s);
        System.out.println("===============主线程执行完毕======================");
        MyThead myThead1 = new MyThead(200);
        FutureTask<String> tf2 = new FutureTask<>(myThead1);
        Thread thread2 = new Thread(tf2);
        thread2.setName("子线程2");
        thread2.start();
        String s2 = tf2.get();
        System.out.println(s2);
    }

    static class MyThead implements Callable<String>{

        private int a ;
        public MyThead(int a ){
            this.a= a ;
        }

        @Override
        public String call() throws Exception {
            int sum=0;
            for (int i = 0; i < a; i++) {
                sum+=i;

            }
            return "子线程求和结果"+sum;
        }
    }
}
