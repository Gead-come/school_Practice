package scool_1;

import java.util.regex.*;

public class pattern_2 {
    public static void main(String[] args) {
        String text = "小李的身份证是12345619900101123X，小王的是987654321098765432。";

        // 正则：18位数字末尾可能是X或x
        Pattern p = Pattern.compile("\\d{17}[\\dXx]");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println("发现身份证号: " + m.group());
        }
        var s = "张三 今年 28岁，身高175cm，体重 69kg";
        // 定义规则
        Pattern pattern = Pattern.compile("\\d+");
        // 匹配规则
        Matcher matcher = pattern.matcher(s);
        // 查找匹配的内容
        while (matcher.find()){
            System.out.println("找到数字"+ matcher.group());
        }

        var str  = "10人的聚会，\n年生有";
        Pattern compile = Pattern.compile("^\\d*");
        Matcher matcher2 = compile.matcher(str);
        while (matcher2.find()){
            System.out.println("找到"+ matcher2.group());
        }

    }
}
