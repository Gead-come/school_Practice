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
        Path sourceDir = Paths.get("C:\\Users\\Webデザイン科\\Desktop\\lalalalal");
        Path targetDir = Paths.get("C:\\Users\\Webデザイン科\\Desktop\\111");

        // 使用 walk 遍历所有文件与子目录
        Files.walk(sourceDir)
                .forEach(sourcePath -> {
                    try {
                        // 构造目标路径：把 sourceDir 替换成 targetDir
                        Path targetPath = targetDir.resolve(sourceDir.relativize(sourcePath));

                        if (Files.isDirectory(sourcePath)) {
                            // 如果是目录，创建目录（多层也会创建）
                            Files.createDirectories(targetPath);
                        } else {
                            // 如果是文件，直接复制
                            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                        }

                    } catch (IOException e) {
                        System.err.println("复制失败：" + sourcePath + " → " + e.getMessage());
                    }
                });

        System.out.println("✅ 全部复制完成！");
    }
}

