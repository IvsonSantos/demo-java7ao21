package com.example.demojava7ao21.java21.thread;

import java.util.concurrent.*;
import java.net.*;
import java.net.http.*;

public class VirtualThreadDemo2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newVirtualThreadPerTaskExecutor();
        Future<String> f1 = service.submit(() -> get("https://horstmann.com/random/adjective"));
        Future<String> f2 = service.submit(() -> get("https://horstmann.com/random/noun"));
        String result = f1.get() + " " + f2.get();
        System.out.println(result);
        service.close();
    }

    private static HttpClient client = HttpClient.newHttpClient();

    public static String get(String url) {
        try {
            var request = HttpRequest.newBuilder().uri(new URI(url)).GET().build();
            return client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        } catch (Exception ex) {
            var rex = new RuntimeException();
            rex.initCause(ex);
            throw rex;
        }
    }

}
