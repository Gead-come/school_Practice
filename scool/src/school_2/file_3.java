package school_2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class file_3 {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient Client = HttpClient.newHttpClient();

        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create("https://codezine.jp/"))
                .build();

        HttpResponse<String> send = Client.send(req, HttpResponse.BodyHandlers.ofString());

        System.out.println(send.body());


    }
}
