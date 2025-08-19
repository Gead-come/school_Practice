package Gui;

public class A4 {
    private String value;
    public void setValue(String value) {
        value = "hello"+value;
    }
    public String toString() {
        return value;
    }
    public static void main(String[] args) {

        A4 s = new A4();
        s.setValue("java");
        System.out.println(s.toString());

    }
}
