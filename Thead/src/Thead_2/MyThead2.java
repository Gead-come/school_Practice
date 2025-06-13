package Thead_2;

public class MyThead2 extends  Thread{
    public MyThead2() {
    }

    public MyThead2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"===>"+i);
        }
    }
}
