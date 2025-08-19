package Gui;
public interface A7 {


    class B7 implements A7 {
        @Override
        public String toString() {
            return "B";
        }

        public static void main(String[] args) {
            A7 A = new B7();
            System.out.println(A); // 输出 B
        }
    }
}
