package Thead_4;

public class BreadTable {
    static private boolean hasBread = false;
    public synchronized void produce(){
        while(hasBread){
            try {
                wait(); // 等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasBread  = true;
        System.out.println("生产者生产開始");
        notify(); // 唤醒
    }
    public synchronized void consume(){
      while(!hasBread){   // 沒有パン
          try {
              wait();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
      hasBread = false; // 沒有パン
      System.out.println("消费者一枚ぱんを食べました");
      notify();
    }
}
