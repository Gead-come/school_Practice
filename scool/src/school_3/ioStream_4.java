package school_3;

import java.util.Arrays;
import java.util.TreeSet;

public class ioStream_4 {
    public static void main(String[] args) {

        TreeSet<Integer> integers = new TreeSet<>(Arrays.asList(1, 2, 4,3,  6,5, 8, 7,  9, 10));

        System.out.println(integers);
        System.out.println(integers.descendingSet()); // 倒序
        System.out.println(integers.ceiling(10));  // ceiling的作用 是返回大于等于指定元素的最小元素
        System.out.println(integers.lower(6));    // lower的作用 是返回小于指定元素最大的元素
        System.out.println(integers.headSet(6,  true));  // headSet的作用 是返回小于指定元素最大的元素
        System.out.println(integers.tailSet(6,  true)); // tailSet的作用 是返回大于等于指定元素最小的元素
    }
}
