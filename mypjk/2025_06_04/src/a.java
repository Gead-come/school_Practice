import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class a {

    public static void main(String[] args) {

        List<student> list = new ArrayList<>();


        Collections.addAll(list,
                new student("张三", 85),
                new student("李四", 59),
                new student("王五", 100),
                new student("赵六", 73),
                new student("钱七", 66),
                new student("孙八", 55),
                new student("赵八", 55));
          //自定义排序
        list.stream().sorted((s1, s2)-> {
            if (s1.getScore() != s2.getScore()) {
                return s1.getScore() - s2.getScore();
            }else {
                return s1.getName().compareTo(s2.getName());
            }
         }).forEach(System.out::println);

        int[]a = {1,2,3,4,5,6,7,8,9,10};

        Arrays.stream(a).boxed().sorted(((o1, o2) -> o2-o1))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Arrays.stream(a).average().ifPresent(System.out::println);

        Arrays.stream(a).boxed().sorted(((o1, o2) -> o2-o1))
                .limit(3).collect(Collectors.toList())
                .forEach(value-> System.out.println("前三名成绩"+value));
    }
}

