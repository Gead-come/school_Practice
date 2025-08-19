package kaoashi;

public interface A {
    default void sam(){
        System.out.println("hello");
    }
}interface B extends A{

}
class C implements B{
    @Override
    public void sam(){
        System.out.println("world");
    }

    public static void main(String[] args) {

        A a = new C();
        a.sam();
    }
}


