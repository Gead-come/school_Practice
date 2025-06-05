package school_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class a {
    public static void main(String[] args) {

        try {
            Stream<Path> walk = Files.walk(Paths.get("C:\\Users\\Webデザイン科\\Desktop\\lalalalal"));
            walk.filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".jpg") || path.toString().endsWith(".png")
                    ).forEach(path -> System.out.println("找到图片：" + path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
