package com.svenjava.multiModule;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author Sven Schröder
 */
public class ClientApp extends Application {

//        var request = HttpRequest.newBuilder()
//                .uri(URI.create("http://localhost:55555/calc/add?num1=10&num2=12"))
//                .GET()
//                .build();
//
//        var client = HttpClient.newHttpClient();
//        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent()));
        stage.show();
    }

    public static class Launcher {
        public static void main(String[] args) {
            Application.launch(ClientApp.class);

        }

    }

    private Parent createContent() {
        var controller = new LocalController();
        return new View(controller);
    }
}
