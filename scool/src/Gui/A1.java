package Gui;

 public  class A1 {
    protected A1 (){
        this(2);
        System.out.println("1");
    }
    protected  A1 (int a){
        System.out.println(a);
    }
}
class b1 extends A1{
     b1(){
         this(4);
         System.out.println("3");
     }
     b1(int b){
         System.out.println(b);
     }
     public static void main(String[] args) {
         new b1();
     }
}
