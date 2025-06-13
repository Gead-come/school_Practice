package Thead_4;

public class Product extends Thread{
    private BreadTable table;   // 作用：保存面包桌对象
    public  Product(BreadTable table){
        this.table = table;  // 保存面包桌对象
    }

    @Override
    public void run() {

            for (int i = 0; i < 5; i++) {
                table.produce();  //这串代码的作用：向面包桌中生产面包
            }
        }

    }

