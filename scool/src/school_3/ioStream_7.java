package school_3;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class ioStream_7 {

    public static void main(String[] args) {


        File[] files = File.listRoots();   // 获取磁盘列表
        System.out.println(Arrays.toString(files));

        File file = new File("C:\\Users\\Webデザイン科\\Desktop\\lalalalal");
        String[] list = file.list(); // 获取文件列表
        for (String s : list) {

            System.out.println(s);
        }
        System.out.println("===============================================");

        File f = new File("C:\\Users\\Webデザイン科\\Desktop\\lalalalal");
        // 获取文件列表
        File[] files1 = f.listFiles();  // listFiles()获取文件列表
        for (File file1 : files1) {
            if (file1.isFile() && file1.getName().endsWith(".txt")) {
                System.out.println(file1.getName());
            }
        }
        System.out.println("===============================================");
        f.listFiles(new FilenameFilter() {  // filenameFilter() 获取文件列表,
            @Override
            public boolean accept(File dir, String name) {
                File sr = new File(dir, name);
                return sr.isFile() && sr.getName().endsWith(".txt");
            }
        });
        // filenameFilter() 获取文件列表,
        f.listFiles((dir, name) -> {
            File sr = new File(dir, name);
            return sr.isFile() && sr.getName().endsWith(".txt");
        });
    }
}
