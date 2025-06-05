package school_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class ioStream_6 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要查找的文件夹路径：");

        String filename = sc.nextLine();

        Path path = Paths.get(filename);
       // Stream<Path> walk1 = Files.walk(Paths.get(filename));

        try (Stream<Path> walk = Files.walk(path)) {
            walk
                    .filter(Files::isRegularFile)  // 只保留文件
                    .filter(s-> s.toString().endsWith(".jpg")||  s.toString().endsWith(".png"))
                    .forEach(s -> System.out.println("找到图片：" + s));
        }

//        try (Stream<Path> walk = Files.walk(path)) {
//            walk
//                    .filter(new Predicate<Path>() {
//                        @Override
//                        public boolean test(Path path) {
//                            return Files.isDirectory(path);
//                        }
//                    });

        catch (Exception e) {
            System.out.println("✖ 文件夹不存在或路径不正确！");
            return;
        }
    }
}