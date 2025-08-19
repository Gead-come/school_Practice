package kaoashi;

public class a1 {
    int x=1;
    void a()
    {
        System.out.println("A");
    }
}
class b1 extends a1 implements A
{
    int x=2;

    void a()
    {
        System.out.println("B");
    }

    public static void main(String[] args) {
        a1 A = new b1();
        System.out.println(A.x);
        A.a();


    }
}
