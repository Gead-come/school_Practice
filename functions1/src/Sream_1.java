import java.util.Arrays;

public class Sream_1 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(arr).boxed().
                filter(num->num%2==0).
                map(num->num*10).
                forEach(System.out::println);

        String s = "hello world";
        String s1  = "Hello world";

        Arrays.stream(s.split(" ")).
                map(word->word.substring(0,1).toUpperCase()+word.substring(1)).
                forEach(System.out::println);
    }
}
