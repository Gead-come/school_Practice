package Thead_5;

import java.util.ArrayList;
import java.util.Collections;

public class demo {
    public static void main(String[] args) {

         ArrayList<Integer> prizes = new ArrayList<>();
        Collections.addAll(prizes,100,500,1000,5000,10000,50000);
        thead5 t1 = new thead5(prizes);
        thead5 t2 = new thead5(prizes);

        t1.setName("抽奖者1");
        t2.setName("抽奖者2");
        t1.start();
        t2.start();


    }
}
