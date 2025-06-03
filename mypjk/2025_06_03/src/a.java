import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class a {
    public static void main(String[] args) {


             Runnable r = ()-> System.out.println("程序正在运行");
             r.run();
        Consumer<String> c=  (s)-> System.out.println("你好"+s);
        c.accept("张三");

        Supplier<String> s = ()->"欢迎回来";
        System.out.println(s.get());

        Function<String, Integer> f = (s1)->s1.length();
        System.out.println(f.apply("HelloLambda"));

        List<String> list = Arrays.asList("张三", "李四", "王五");

        list.forEach(System.out::println);

        List<String> list1 = Arrays.asList("张三:28:男", "李三:22:男");

        List<String> collect = list1.stream().map(s1 -> s1.split(":")[1])
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
