import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sream_2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Collections.addAll(list,"张三，28","张四，59","王五，20","赵六，21","钱七，26","张五，18");

 //       Stream<String> arr = list.stream().filter(name -> name.contains("张"));
//
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.split("，")[1].compareTo(o2.split("，")[1]);
//            }
//        });
        Stream<String> no = list.stream().filter(name -> name.contains("张")).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = Integer.parseInt(o1.split("，")[1])-Integer.parseInt(o2.split("，")[1]);
                return i;
            }
        });



        List<String> collect = no.collect(Collectors.toList());

        System.out.println(collect);

    }


}
