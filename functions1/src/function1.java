import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class function1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Collections.addAll(list,"张三,18","李四,19","王五,20","赵六,21","钱七,22");

        Stream<Student> studentStream = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new Student(s);
            }
        });
        Student[] array = studentStream.toArray(new IntFunction<Student[]>() {
            @Override
            public Student[] apply(int value) {
                return new Student[value];
            }
        });
        System.out.println(Arrays.toString(array));
        System.out.println("===========================");
        Student[] array2 = list.stream().map(Student::new).toArray(Student[]::new);

        System.out.println(Arrays.toString(array2));
    }
}
