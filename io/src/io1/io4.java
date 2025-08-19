package io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class io4 {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\123.txt");
        StringBuilder stringBuilder = new StringBuilder();
        int ch;
        while((ch = fileReader.read())!=-1){
           stringBuilder.append((char) ch);
        }
        fileReader.close();
        System.out.println(stringBuilder);
        Integer[] array = Arrays.stream(stringBuilder.toString()
                .split("-"))
                .map(s -> Integer.parseInt(s.trim())) // 使用 trim() 去除两端空白字符
                .sorted()
                .toArray(Integer[]::new);
        FileWriter fileWriter = new FileWriter("C:\\Users\\Webデザイン科\\IdeaProjects\\untitled\\123.txt");

        String string = Arrays.toString(array).replace(",", "-");
        String substring = string.substring(1, string.length() - 1);
        fileWriter.write(substring);
        fileWriter.close();
        System.out.println(substring);


    }
}