package school_1;

public class String_4 {
    public static void main(String[] args) {
        System.out.println(String.format("%s %s %d", "里斯",  "张三", 18));

         String s1 = "java最高java";
         String s2 = "java从入门到跑路java";

         // 替换
        System.out.println(s1.replace("java", "python"));
        // 替换第一个
        System.out.println(s2.replaceFirst("java", "python"));
        // 替换所有
        System.out.println(s2.replaceAll("java", "python"));
       // 连接
        System.out.println(String.join(s2, "--", "--"));

        String str = "www.baidu.com";
        System.out.println(str.replace(".", "-"));      // www-baidu-com ✅
        System.out.println(str.replaceAll(".", "-"));   // ----------- ⚠️

         String gg = "你是一只猪，草泥马，傻逼，你在干嘛,傻逼";

        System.out.println(gg.replaceAll("猪，草泥马，傻逼|傻逼", "****"));


    }
}
