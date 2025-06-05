package school_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ioStream_2 {
    public static void main(String[] args) {
        // 1. 控制台获取原文件名和目标文件名
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要复制的图片路径（例如 C:\\\\Users\\\\pan11\\\\Desktop\\\\dog.png）：");
        String srcPath = scanner.nextLine();

        System.out.print("请输入目标图片路径（例如 C:\\\\Users\\\\pan11\\\\Desktop\\\\dog_copy.png）：");
        String destPath = scanner.nextLine();
                        // C:\Users\Webデザイン科\Desktop\１.png
        // 2. 字节流复制图片
        try(FileInputStream fileInputStream = new FileInputStream(srcPath);
            FileOutputStream fileOutputStream = new FileOutputStream(destPath)){

            byte[] bytes = new byte[1024];
            int len;
            while((len = fileInputStream.read(bytes))!= -1 ){
                fileOutputStream.write(bytes, 0, len);
            }
            System.out.println("图片复制成功！");

            File file = new File(destPath);
            if (file.exists()){// 文件存在
                file.delete();
                System.out.println("图片删除成功！");
            } else {
                System.out.println("图片删除失败！");
            }

        }
        catch (Exception e){
            e.printStackTrace();
         //   System.out.println("图片复制失败！"+e.getMessage());
        }
    }
}