package Thead_4;

public class Consumer extends  Thread{
    private BreadTable table;    //  共享资源
    public Consumer(BreadTable table){
        this.table = table;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            table.consume();
        }
    }
}
