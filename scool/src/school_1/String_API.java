package school_1;

public class String_API {
    public static void main(String[] args) {

        String s = "hello world";
        String s1  = "　Hello world　";


        System.out.println(s.length());

        // charAt 获取字符串中某个索引处的字符
        System.out.println(s.charAt(0));
    // equals 比较字符串
        System.out.println(s.equals(s1));
        // equalsIgnoreCase 比较字符串，忽略大小写

        System.out.println(s.equalsIgnoreCase(s1));

        // toLowerCase 转换为小写
        System.out.println(s.toLowerCase());
        // toUpperCase 转换为大写
        System.out.println(s.toUpperCase());

        // trim 去掉字符串两端的空格
//        System.out.println(s1.trim());
//        System.out.println(s.trim().equalsIgnoreCase(s1));

        // stripLeading 去掉字符串开头的空格
        System.out.println(s.stripLeading());

        // stripTrailing 去掉字符串结尾的空格
        System.out.println(s.stripTrailing());

        //  strip 去掉字符串两端的空格
        System.out.println(s.strip());
        System.out.println(s.strip().equalsIgnoreCase(s1.strip()));


        // indexOf 从开始处获取字符串中某个字符的索引
        System.out.println(s.indexOf("o"));
        System.out.println(s.indexOf("x"));

        // lastIndexOf  从末尾处获取字符串中某个字符的索引
        System.out.println(s.lastIndexOf("w"));

        // indexOf(String str, int fromIndex) 从指定索引处获取字符串中某个字符的索引
        System.out.println(s.indexOf("o", 6));
        System.out.println(s.lastIndexOf("o", 2));

    }
}
