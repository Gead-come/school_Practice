package kaoashi;

public class sam {

    private String val;
    private int num;
    public sam(int num){
        this.num = num;
    }
    public sam(){
        this.val = "hello";
        this.num = 10;
    }


    public static void main(String[] args) {
        sam m = new sam(20);
        System.out.println(m.num+""+m.val);

        String a ="A";
        a = a.concat("B");
        String b = "C";
        a = a.concat(b);
        a.replace("C","D");
        a=a.concat(b);
        System.out.println( a);
    }
}
