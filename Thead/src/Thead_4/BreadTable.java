package Thead_4;

public class BreadTable {
    static private boolean hasBread = false;
    public synchronized void produce(){
        while(hasBread){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasBread  = true;
        System.out.println("生产者生产開始");
        notify();
    }
    public synchronized void consume(){
      while(!hasBread){
          try {
              wait();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
      hasBread = false;
      System.out.println("消费者一枚ぱんを食べました");
      notify();
    }
}
