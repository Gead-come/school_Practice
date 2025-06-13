package school_3;

import java.io.File;

public class ioStream_5 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Webデザイン科\\Desktop\\lalalalal\\新しいフォルダー\\１１１\\２２２２");
        gg(file);

        // 递归

    }public static void gg (File sosa){
        if (!sosa.exists()) return;  // isFile()判断是否是文件
        File[] files = sosa.listFiles(); // listFiles()获取文件列表
        if (files == null) return;      // 如果是空文件列表，直接返回
        for (File file : files) {
            if (file.isDirectory()){
                gg(file);
            }else if (file.getName().endsWith(".png") || file.getName().endsWith(".jpg")){
                System.out.println(file.getName());
                System.out.println("找到图片：" + file.getAbsolutePath()); //
            }
        }
    }
}
