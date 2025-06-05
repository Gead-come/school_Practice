import java.util.*;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {

        List<student> list = new ArrayList<>();


        Collections.addAll(list,
                new student("张三", 85),
                new student("李四", 59),
                new student("王五", 100),
                new student("赵六", 73),
                new student("钱七", 66),
                new student("孙八", 55));

        //  System.out.println("原始名单" + list);
        System.out.println("原始名单：");
        list.forEach(System.out::println);


        List<student> collect = list.stream().filter(s -> s.getScore() > 60)
                .collect(Collectors.toList());
        System.out.println("及格名单" + collect);

        List<student> collect1 = list.stream().filter(s -> s.getScore() < 60)
                .collect(Collectors.toList());

        System.out.println("不及格名单" + collect1);

        list.stream().mapToInt(s -> s.getScore())  // mapToInt()的作用是将流中的元素映射为int
                .average().ifPresent(System.out::println);// average()的作用是求平均值
        // ifPresent()的作用是判断Optional对象是否包含值，如果包含值则执行Consumer接口的实现方法，否则不执行
        list.stream().max(Comparator.comparingInt(student::getScore))
                .stream().collect(Collectors.toList())
                .forEach(s -> System.out.println("最高分" + s.getScore()));

        List<student> collect2 = list.stream().sorted(Comparator.comparingInt(student::getScore))
                .collect(Collectors.toList());
        System.out.println("排序后的名单" + collect2);

    }
}