package Thead_3;

public class MyThead extends Thread {
    static int tickets = 0; // 所有线程共享10张票
  // static final Object LOCK = new Object();

    public void run() {
          while (true){
                  if (tickets <100){
                      try {
                          Thread.sleep(500);
                      } catch (InterruptedException e) {
                          throw new RuntimeException(e);
                      }
                      tickets++;
                      System.out.println(getName()+"売り出し"+(tickets)+"枚票");
                  }else {
                      break;
                  }
              }
          }
          }



