import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ｂ {

    public static void main(String[] args) {


        ArrayList<student> list = new ArrayList<>();

        Collections.addAll(list,
                new student("张三", 85),
                new student("李四", 59),
                new student("王五", 100),
                new student("赵六", 73),
                new student("钱七", 66),
                new student("孙八", 55));
        // 打印成绩信息
        list.forEach(System.out::println);

           list.stream().mapToInt((s)->s.getScore())
                   .max().ifPresent(score-> System.out.println("最高分是"+score));
           list.stream().mapToInt((s)->s.getScore())
                   .min().ifPresent(score-> System.out.println("最低分是"+score));
           list.stream().mapToInt(s -> s.getScore()).average()
                   .ifPresent(score-> System.out.println("平均分是"+score));
           list.stream().mapToInt(s -> s.getScore())
                   . sorted()
                   .boxed()
                   .collect(Collectors.toList())
                   .reversed()
                   .stream().limit(3)
                   .forEach(score-> System.out.println("前三名成绩 :" +score));


           list.stream().map(student::getScore)
                   .sorted((o1, o2) -> o2 - o1)
                   .limit(3)
                   .forEach(score-> System.out.println("前三名成绩 :" +score));

        list.stream().map(student::getScore)
                .sorted(Collections.reverseOrder())  // 降序
                .limit(3)
                .forEach(score-> System.out.println("前三名成绩 :" +score));
    }
}
