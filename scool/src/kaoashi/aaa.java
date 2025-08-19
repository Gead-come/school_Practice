package kaoashi;

public class aaa {
    private String value;
    public void setValue(String value){
       value ="hello" + value;
    }
    public String toString(){
        return value;
    }

    public static void main(String[] args) {

        aaa aaa = new aaa();
        aaa.setValue("world");
        System.out.println(aaa);
    }
}
