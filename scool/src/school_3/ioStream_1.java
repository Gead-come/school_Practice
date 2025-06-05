package school_3;

import java.io.*;

public class ioStream_1 {
    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("C:\\Users\\Webデザイン科\\Desktop\\lalalalal\\新規 テキスト ドキュメント.txt",  true))) {
            writer.newLine();
            writer.write("hello world");

        }
        catch (Exception e){
            e.printStackTrace();
        }


        try(BufferedReader buff = new BufferedReader(
                new FileReader("C:\\Users\\Webデザイン科\\Desktop\\lalalalal\\新規 テキスト ドキュメント.txt"))){
            String line;
            while((line = buff.readLine())!= null){
                System.out.println(line);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }

        //


    }
}