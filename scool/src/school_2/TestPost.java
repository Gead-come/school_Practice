package school_2;

import java.net.URI;
import java.net.http.*;

public class TestPost {
    public static void main(String[] args) throws Exception {
        String json = "{\"msg\":\"hello\"}";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/post"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("状态码：" + response.statusCode());
        System.out.println("响应内容：\n" + response.body());
    }
}

