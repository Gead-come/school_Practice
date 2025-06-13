package school_4;

public class MyThead extends Thread {
    static int tickets = 0; // 所有线程共享10张票
   static final Object LOCK = new Object();

    public void run() {
          while (true){

              synchronized (LOCK) {
                  if (tickets <100){
                      try {
                          Thread.sleep(5);
                      } catch (InterruptedException e) {
                          throw new RuntimeException(e);
                      }
                      tickets++;
                      System.out.println(getName()+"正在卖"+(tickets)+"张票");
                  }else {
                      break;
                  }
              }
          }
          }
        }



