package interAddrese.tcp7;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    static String[]weather ={"晴れ","曇り","雨","晴れのち曇り","雨のち曇り","雨のち雨","雨のち晴れ"};
    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(5000)){
            while(true){
                System.out.println("接続待ち");
                Socket accept = serverSocket.accept();
                PrintWriter printWriter = new PrintWriter(accept.getOutputStream());
                String weather = getWeather();
                printWriter.println(weather);
                accept.close();
                System.out.println("接続完了");
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        }
    static String getWeather(){
        int index = (int)(Math.random()*weather.length);
        return weather[index];
    }
}
