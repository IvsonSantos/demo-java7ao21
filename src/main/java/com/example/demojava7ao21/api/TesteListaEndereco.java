package com.example.demojava7ao21.api;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TesteListaEndereco {

    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
       

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(new URI("http://viacep.com.br/ws/01001000/json"))
               .build();

        BufferedReader buffer = new BufferedReader(new InputStreamReader(client.send(request, HttpResponse.BodyHandlers.ofInputStream()).body()));

        Gson gson = new Gson();
        Endereco eendereco = gson.fromJson(buffer, Endereco.class);
        System.out.println(eendereco.getLogradouro());


        //HttpResponse<String> response2 = client.send(request, HttpResponse.BodyHandlers.ofString());
        //BufferedReader resposta = new BufferedReader(new InputStreamReader((response.body()));
        //System.out.println(response2.body());

        //String jsonEmString = converteJsonEmString(response2);

    }

    /*
    public static String converteJsonEmString(HttpResponse<String> buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }

     */

}
