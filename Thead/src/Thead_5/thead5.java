package Thead_5;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class thead5 extends Thread{
    static private final ArrayList<Integer>prizePool=new ArrayList<Integer>();
    static  private final Random r = new Random();
    private ArrayList<Integer>MyPrize=new ArrayList<Integer>();
    public thead5(ArrayList<Integer>prizes){
        synchronized (thead5.class){
            if (prizePool.isEmpty()){
                prizePool.addAll(prizes);
            }
        }
    }

    @Override
    public void run() {
        try{
            while(true){
                Integer prize = getprize();
                if (prize==null)break;
                MyPrize.add(prize);
                System.out.println(getName()+"抽中"+prize);
                TimeUnit.MICROSECONDS.sleep(1000);
            }
            synchronized (thead5.class){
                System.out.println(getName()+"の当選は"+MyPrize);
                // 求总金额
                int sum = 0;
                for (Integer i:MyPrize){
                    sum+=i;
                }
                System.out.println(getName()+"的奖金是"+sum);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();  // 恢复中断状态
            System.out.println(getName()+"终端结果"+MyPrize);
        }
    }

    private Integer getprize(){
        synchronized (thead5.class){

            return prizePool.isEmpty()?null:prizePool.remove(r.nextInt(prizePool.size()));
        }
    }

    }
