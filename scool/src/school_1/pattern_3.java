package school_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern_3 {
    public static void main(String[] args) {

        String s = "<div>你好</div><p>hello</p>";
        Pattern compile = Pattern.compile("<.+?>");
        Matcher matcher = compile.matcher(s);
        while(matcher.find()){
            System.out.println( matcher.group());
        }
        System.out.println("========================");
        String s1 = "<div>你好</div><p>hello</p>";
        Pattern compile1 = Pattern.compile("<.+>");
        Matcher matcher1 = compile1.matcher(s1);
        while(matcher1.find()){
            System.out.println( matcher1.group());
        }
        System.out.println("========================");
        String s2 = "<div>你好</div><p>hello</p>";
        String s3 = s2.replaceAll("<.+?>", "");
        System.out.println(s3);

        String gg = "你是一只猪，草泥马，傻逼，你在干嘛,傻逼";

// 使用 Pattern 和 Matcher 实现更高效的多关键词替换
        String patternString = "猪，草泥马，傻逼|傻逼|草泥马"; // 可扩展更多词
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher3 = pattern.matcher(gg);

        String result = matcher3.replaceAll("****");

        System.out.println(result);


    }
}
