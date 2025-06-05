package school_3;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BatchRenameImages {
    /**
 * 主程序入口
 * 该程序用于批量重命名指定文件夹下的所有 .png 或 .jpg 图片文件
 * 用户通过控制台输入文件夹路径，程序将该文件夹下所有符合条件的图片文件进行重命名
 * 重命名规则为：img_001.png、img_002.jpg 等，根据文件计数递增
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("请输入图片所在的文件夹路径：");
    String folderPath = scanner.nextLine();

    File folder = new File(folderPath);
    // 检查路径是否存在且为文件夹

    gg(folder);
    // 获取所有 .png 或 .jpg 文件
    File[] imageFiles = folder.listFiles(gg -> gg.isFile()
            && gg.getName().endsWith(".png")
            || gg.getName().endsWith(".jpg"));



    DecimalFormat df = new DecimalFormat("000"); // 001, 002...
    int count = 1;

    // 遍历所有图片文件进行重命名
    for (File file : imageFiles) {
        String extension = file.getName().substring(file.getName().lastIndexOf("."));  //lastIndexOf() 方法返回最后一个 . 的索引位置
        String newName = "img_" + df.format(count) + extension;  // format() 方法将数字转换为字符串
        File newFile = new File(folder, newName);

        // 尝试重命名文件
        if (file.renameTo(newFile)) {   // renameTo() 方法返回 true 表示重命名成功
            System.out.println("✅ 重命名成功：" + file.getName() + " → " + newName);
        } else {
            System.out.println("⚠️ 重命名失败：" + file.getName());
        }
        count++;
    }

    // 所有图片重命名完成后通知用户
    System.out.println("🎉 所有图片重命名完成！");
}
    public static void gg (File sosa){
        if (!sosa.exists()) return;  // isFile()判断是否是文件
        File[] files = sosa.listFiles(); // listFiles()获取文件列表
        if (files == null) return;      // 如果是空文件列表，直接返回
        for (File file : files) {
            if (file.isDirectory()){    // 如果是文件夹，递归调用
                gg(file);
            }else if (file.getName().endsWith(".png") || file.getName().endsWith(".jpg")){
                System.out.println(file.getName());
                System.out.println("找到图片：" + file.getAbsolutePath());
            }
        }
    }

}
