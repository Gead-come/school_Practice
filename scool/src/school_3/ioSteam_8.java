package school_3;

import java.io.File;
import java.io.IOException;

public class ioSteam_8 {
    public static void main(String[] args) throws IOException {

        // 案例 在文件夹里创建txt文档
        File file = new File("mypjk\\2025_06_03");
        File file2 = new File("C:\\Users\\Webデザイン科\\Desktop\\lalalalal");

        if (!file.isFile() && !file.exists() != true) {
            file.mkdirs();  //mkdirs()创建多级目录
        }
        File file1 = new File("mypjk\\2025_06_03\\a.txt");
        boolean newFile = file1.createNewFile();    //
        if (newFile) {
            System.out.println("创建成功");
        } else {
            System.out.println("创建失败");
        }
        System.out.println("=======================================================");
        // 案例2

        boolean bb = bb(file);
        System.out.println(bb);
        System.out.println("=======================================================");
        aa(file2);
    }

    public static void aa(File s) {

        if (!s.exists())return;
        File[] files = s.listFiles();
        if (files == null)return;
        for (File file : files) {
            if (file.isDirectory()){
                aa(file);
            }
            if (file.getName().endsWith(".png") ) {
                System.out.println(file.getName());
                System.out.println("找到文档：" + file.getAbsolutePath());
            }
        }
    }
    public static boolean  bb(File file) {

        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()&& file1.getName().endsWith(".avi")){
                return true;
            }
        }
        return false;
    }
}