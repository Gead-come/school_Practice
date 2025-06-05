package school_1;

public class String_2 {
    public static void main(String[] args) {

        String s = "hello world11";
        String s1  = "Hello world";
        String  s2  = "张三,里斯，王五";

        // compareTo 比较字符串
        System.out.println(s.compareTo(s1)); //
        // compareToIgnoreCase 忽略大小写比较字符串
        System.out.println(s.compareToIgnoreCase(s1));

        // substring 从开始处获取字符串中某个字符的索引
        System.out.println(s.substring(0, 5));

        System.out.println(s.substring(s.indexOf("w")));


        System.out.println("===========================");
       // charAt 获取字符串中某个字符的索引
        System.out.println(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

         // startsWith 判断字符串是否以某个字符开头
        System.out.println(s.startsWith("H"));

        // endsWith 判断字符串是否以某个字符结尾
        System.out.println(s2.endsWith("五"));

         // contains 判断字符串是否包含某个字符
        System.out.println(s.contains("w"));



    }
}
