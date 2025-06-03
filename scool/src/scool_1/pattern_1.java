package scool_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern_1 {
    public static void main(String[] args) {

         String num = "西欧电话 090-2131-1211,小王电话 050-4444-1111";
        Pattern compile = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
        Matcher matcher = compile.matcher(num);
        while(matcher.find()){
            System.out.println("找到"+matcher.group());
        }
         var str = "初めまして、\nよろしくお願いいたします。";
        // 说明 ：.+ 表示匹配任意字符，但只能匹配一行
        Pattern compile2 = Pattern.compile("^.+");
       Matcher matcher2 = compile2.matcher(str);
        while(matcher2.find()){
            System.out.println(matcher2.group());
        }

                String data = "张三, 李四; 王五 / 赵六";

                // 用 , ; / 空格 分割
                Pattern pattern = Pattern.compile("[,;/\\s]+");

                String[] names = pattern.split(data);

                for (String name : names) {
                    System.out.println("名字: " + name);
                }
            }
        }
