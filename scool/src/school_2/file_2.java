package school_2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class file_2 {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest build = HttpRequest.newBuilder()
                .uri(URI.create("https://example.com"))
                .GET()
                .build();
        HttpResponse<String> send = httpClient.send(build, HttpResponse.BodyHandlers.ofString());

        System.out.println(send.body());
        System.out.println("==============================");

        String requestBody = "{\"name\":\"张三\", \"age\":28}";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.example.com/data"))
                .header("Content-Type", "application/json") // 通知服务器我是 JSON 格式
                .POST(HttpRequest.BodyPublishers.ofString(requestBody)) // 请求体：要发送的数据
                .build();




    }
}
