package school_4;

public class NoSyncTest {
    public static void main(String[] args) {
        MyThead my1 = new MyThead();
        MyThead my2 = new MyThead();
        MyThead my3 = new MyThead();


        my1.setName("窓口１");
        my2.setName("窓口２");
        my3.setName("窓口３");

        my1.start();
        my2.start();
        my3.start();
    }
}
