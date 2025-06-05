package school_3;

import java.nio.file.*;
import java.util.Scanner;
import java.io.IOException;

public class NIOCopyImage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 用户输入原图路径和目标路径
        System.out.print("请输入要复制的图片路径（原图）：");
        String srcPath = scanner.nextLine();

        System.out.print("请输入复制后的目标路径（新图）：");
        String destPath = scanner.nextLine();

        try {
            // 2. 使用 Files.copy() 实现复制（自动替换同名文件）
            Files.copy(
                    Paths.get(srcPath),   // 原始图片路径
                    Paths.get(destPath),  // 新图片路径
                    StandardCopyOption.REPLACE_EXISTING // 如果目标已存在，就覆盖
            );

            System.out.println("✅ 图片复制成功！");
        } catch (IOException e) {
             e.printStackTrace();
        }
    }
}
