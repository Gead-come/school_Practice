package Thead_2;

public class Thead_2 {
    public static void main(String[] args) throws InterruptedException {

          MyThead2 ss = new MyThead2();
          ss.setName("白い");
          ss.start();
         ss.join();   // 线程1执行完毕之后，线程2才能执行
      //  ss.setDaemon(true);

          for (int i = 0; i < 10; i++){
              System.out.println("main"+i);
          }
    }
}
