package Gui;

class A {
    int value = 1;

    public A() {
        System.out.println("A: " + value);
        show();
    }

    public void show() {
        System.out.println("A show: " + value);
    }
}

class B extends A {
    int value = 2;

    public B() {
        System.out.println("B: " + value);
    }

    @Override
    public void show() {
        System.out.println("B show: " + value);
    }

    public static void main(String[] args) {
        new B();

         boolean d = (10==10);
         System.out.println(d);

         short b =(short)'A';
         System.out.println(b);

    }
}
