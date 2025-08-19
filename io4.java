import java.util.Arrays;
import java.util.List;

class io4 {
    public static void main(String[] args) {
        String input = "5, 511, 31, 42, 43, 46, 61, 62, 72, 672, 822";
        List<Integer> numbers = Arrays.stream(input.split(", "))
                .map(s -> Integer.parseInt(s))
                .toList(); // 修改完成并确保逗号分隔内容能正确解析
    }
}
