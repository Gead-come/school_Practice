package Gui;

 class A3 {
     String name;
     int num;
     public A3(String name, int num)
     {
         this.name = name;
         this.num = num;
     }
}
class sub extends A3 {
     int pri;
     public sub(int  pri){
         super("moren",100);
         this.pri = pri;
     }

    public sub(String name, int num,int  pri)
    {
        super(name, num);

    }

    public static void main(String[] args) {
        sub s1 = new sub(100);
        sub s2 = new sub("张三", 10, 20);
        System.out.println(s2.name+","+s2.num+","+s2.pri);
        System.out.println(s1.name+","+s1.num+","+s1.pri);
    }
}
