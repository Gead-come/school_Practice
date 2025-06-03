import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class function2 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        Collections.addAll(list,"张三,18","李四,19","王五,20","赵六,21","钱七,22");

        Stream<Student> studentStream = list.stream().map((String s)-> new Student(s));

        Student[] array = studentStream.toArray((int value) ->  new Student[value]  );

        System.out.println(Arrays.toString(array));

        Stream<Student> studentStream1 = list.stream().map(Student::new);
        Student[] array1 = studentStream1.toArray(Student[]::new);
        System.out.println(Arrays.toString(array1));

        list.stream().map(Student::new).forEach(System.out::println);
        Student[] array2 = list.stream().map(Student::new).toArray(Student[]::new);

        System.out.println(Arrays.toString(array2));
    }
}
