package io1;

import java.io.*;

public class io3 {
    public static void main(String[] args) throws IOException {
//
//        FileInputStream st = new FileInputStream(new File("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\img_002.png"));
//        FileOutputStream os = new FileOutputStream(new File("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\img_003.png"));

        String st = "C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\img_002.png";
        String os = "C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\img_003.png";

        int key = 123;

        try {
            entry(st, os, key);
            System.out.println("加密成功");
        } catch (Exception e) {
            System.out.println("加密失败");
        }
    }


        public static void entry(String st, String os,int key){
            try(FileInputStream fileInputStream = new FileInputStream( st);
                FileOutputStream fileOutputStream = new FileOutputStream( os)
            ) {
                int len;
                while ((len = fileInputStream.read()) != -1) {
                    fileOutputStream.write(len ^ key);
                }

        } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

