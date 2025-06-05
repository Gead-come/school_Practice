package school_3;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ioSteam_3 {
    public static void main(String[] args) {
         // 输入要复制的文件名
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要复制的文件名");
        String FileName = sc.nextLine();


        File folder = new File(FileName); // 获取文件夹
        if (!folder.exists() || !folder.isDirectory()){
            System.out.println("路径无效或不是文件夹！");
            return;
        }
        File[] files = folder.listFiles(gg -> gg.isFile()
                && gg.getName().endsWith(".png")
                || gg.getName().endsWith(".jpg"));

         if (files == null || files.length == 0){
             System.out.println("没有找到图片文件！");
             return;
         }
        DecimalFormat decimal = new DecimalFormat("000");
         int count = 1;

        for (File file : files) {
            String sub = file.getName().substring(file.getName().indexOf("."));
            String nam ="img_"+decimal.format(count)+sub; // 新的文件名
            File newfile = new File(folder, nam);
         if (file.renameTo(newfile)){
             System.out.println("✅ 重命名成功："+file.getName()+" → "+nam);
         }else {
             System.out.println("⚠️ 重命名失败："+file.getName());
         }
            count++;
         }
        }
    }

