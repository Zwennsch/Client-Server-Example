package com.svenjava.multiModule;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class RemoteController implements Controller {
    private HttpClient client = HttpClient.newHttpClient();

    @Override
    public CompletableFuture<Integer> onAdd(int num1, int num2) {
        var request = HttpRequest.newBuilder()
              .uri(URI.create("http://localhost:55555/calc/add?num1="+num1+"&num2="+num2))
                .GET()
                .build();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(Integer::parseInt);
    }

    @Override
    public CompletableFuture<Integer> onSub(int num1, int num2) {
        var request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:55555/calc/sub?num1="+num1+"&num2="+num2))
                .GET()
                .build();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(Integer::parseInt);
    }
}
