package io1;

import java.io.*;

public class io {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Webデザイン科\\Desktop\\lalalalal");
        File file1 = new File("C:\\Users\\Webデザイン科\\Desktop\\111");
        copy(file,file1);
    }
    public static void copy(File sre , File dest) throws IOException {
        dest.mkdirs();
        File[] files = sre.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fileInputStream.read(bytes)) != -1) {
                    fileOutputStream.write(bytes, 0, len);
                }
                 fileOutputStream.close();
                fileInputStream.close();

            }else if (file.isDirectory()) {
                copy(file,new File(dest, file.getName()));

            }
        }
    }
}
