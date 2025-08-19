package io1;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class test {
    @Test
    public void test1() throws IOException {
        Path source = Paths.get("C:\\Users\\Webデザイン科\\Desktop\\ReadFileTest");
        Path target = Paths.get("C:\\Users\\Webデザイン科\\Desktop\\ReadFileTest1");


           // 第一步使用 walk 遍历所有文件与子目录
        Files.walk( source)
                // 遍历每个文件
                .forEach(path -> {
                    // 获取目标路径
                    try {
                        // 复制文件，覆盖已存在的文件
                        Path newTarget = target.resolve(source.relativize(path));
                        // 如果是目录，则创建目录
                        if (Files.isDirectory(path)){
                            Files.createDirectories(newTarget);
                        }else {
                    Files.copy(path, newTarget, StandardCopyOption.REPLACE_EXISTING
                                    , StandardCopyOption.COPY_ATTRIBUTES);
                        }
                    } catch (IOException e) {
                        System.err.println("复制失败：" + path + " → " + e.getMessage());
                    }
                });
        System.out.println("✅ 批量复制完成！");
    }
}

