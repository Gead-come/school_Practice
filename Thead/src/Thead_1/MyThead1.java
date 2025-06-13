package Thead_1;

public class MyThead1 extends  Thread{
    public MyThead1() {
    }

    public MyThead1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"===>"+i);
        }
    }
}
