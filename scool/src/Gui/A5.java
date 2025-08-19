package Gui;

import java.util.function.Function;

public class A5 {
    static String he ="A:";
    private String me ="B";
    public static String getMe(){
        return new A5().me;
    }

    public static void main(String[] args) {
        A5 s = new A5();
        System.out.println(A5.he +A5.getMe());
        Function<String , String>func =x->x.toUpperCase();
        System.out.println(func.apply("hello"));

        Function<String , String>func1 =(String x)->{return x.toUpperCase();};
        System.out.println(func.apply("hello"));

    }
}
