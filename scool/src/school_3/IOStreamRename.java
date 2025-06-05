package school_3;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

public class IOStreamRename {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的文件夹路径：");
        String path = sc.nextLine();

        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("✖ 文件夹不存在或路径不正确！");
            return;
        }

        // 获取所有 .png 或 .jpg 文件
        File[] imageFiles = dir.listFiles(fil ->
                fil.isFile() && (
                        fil.getName().endsWith(".png") || fil.getName().endsWith(".jpg")
                )
        );

        if (imageFiles == null || imageFiles.length == 0) {
            System.out.println("没有找到任何图片文件！");
            return;
        }

        DecimalFormat df = new DecimalFormat("000");
        int count = 1;

        for (File oldFile : imageFiles) {
            String extension = oldFile.getName().substring(oldFile.getName().lastIndexOf("."));
            String newName = "img_" + df.format(count) + extension;
            File newFile = new File(dir, newName);

            if (oldFile.renameTo(newFile)) {
                System.out.println("✅ 重命名成功：" + oldFile.getName() + " → " + newName);
            } else {
                System.out.println("⚠️ 重命名失败：" + oldFile.getName());
            }

            count++;
        }

        System.out.println("🎉 所有图片重命名完成！");
    }
}
