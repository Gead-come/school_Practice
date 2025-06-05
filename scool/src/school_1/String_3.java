package school_1;

public class String_3 {
    public static void main(String[] args) {

        String  s2  = "张三,里斯,王五";

         // split 分割字符串
        String[] split = s2.split(",");
        // join 合并字符串
        System.out.println(String.join("--",  split));

        String[] split2 = s2.split("");
        // join 合并字符串
        System.out.println(String.join("--",  split2));

    }
}
