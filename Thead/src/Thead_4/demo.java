package Thead_4;

public class demo {
    public static void main(String[] args) {
        BreadTable table = new BreadTable();
       new Product(table).start();
       new Consumer(table).start();

    }
}
