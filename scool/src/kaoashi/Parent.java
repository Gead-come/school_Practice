package kaoashi;

class Parent {
     void say() {
        System.out.println("Parent say");
    }
}
class Child extends Parent {
    @Override
     void say() {
        System.out.println("Child say");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.say();
        Child p1 = new Child();
        p1.say();

    }
}
