package interAddrese.tcp6;

import interAddrese.tcp5.myRunable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b6 {
    public static void main(String[] args) throws IOException {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                5,
                10,
                60,
                TimeUnit.MICROSECONDS,
                new ArrayBlockingQueue<>(20),  // 阻塞队列
                new MyThreadFactory6("抢票线程"),  // 线程工厂
                new ThreadPoolExecutor.AbortPolicy()  // 拒绝策略
        );
        ServerSocket server = new ServerSocket(10086);
        System.out.println("服务端启动");
        System.out.println("等待客户端连接");
        while (true) {
            Socket accept = server.accept();

          //  new Thread(new myRunable(accept)).start();

            pool.submit(new myRunable(accept));

        }
    }
}