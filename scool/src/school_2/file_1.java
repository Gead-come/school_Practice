package school_2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class file_1 {
    public static void main(String[] args) throws Exception {

        Path path = Paths.get("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\scool\\src\\date.txt");

        System.out.println(Files.exists(path));  // 判断文件是否存在

        System.out.println(Files.isReadable(path)); // 判断文件是否可读

        System.out.println(Files.isWritable(path)); // 判断文件是否可写

        System.out.println(Files.isExecutable(path)); // 判断文件是否可执行

        System.out.println(Files.size(path)); // 获取文件大小

        Path path1 = Files.copy(path, Paths.get   // 复制文件
                        ("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\scool\\src\\date_1.txt")
                , StandardCopyOption.REPLACE_EXISTING);

          Files.move(path1, Paths.get("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\scool\\src\\date_2.txt"),
                StandardCopyOption.REPLACE_EXISTING);  // 移动文件

        Path path2 = Files.move(path, Paths.get("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\scool\\src\\date_3.txt"),
                StandardCopyOption.REPLACE_EXISTING);   // 移动文件
//
//        Files.delete(path1);   // 删除文件 如果文件不存在则抛出异常
//
//        Files.deleteIfExists(path);  // 删除文件,如果文件不存在则返回false
    }
}
