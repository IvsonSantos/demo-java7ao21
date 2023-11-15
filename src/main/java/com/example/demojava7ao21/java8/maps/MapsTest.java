package com.example.demojava7ao21.java8.maps;

import java.util.HashMap;
import java.util.Map;

public class MapsTest {

    public static void main(String[] args) {

        // mapa vazio
        Map<String, String> map = Map.of();

        // mapa com valores
        Map<String, String> map2 = Map.of("key1","value1", "key2", "value2");

        // mapa com chaves
        Map<String, String> map3 = Map.ofEntries(
                Map.entry("key1","value1"),
                Map.entry("key2", "value2"),
                Map.entry("key100", "value100")
        );

        // mapa com NEW
        Map<String, String> map4 = new HashMap<>();
        map4.put("Android", "Mobile");
        map4.put("Eclipse IDE", "Java");
        map4.put("Eclipse RCP", "Java");
        map4.put("Git", "Version control system");

        // remover do Map
        Map<String, String> map5 = new HashMap<>(Map.of(
                "Android",
                "Mobile OS",
                "Flutter",
                "Development environment"));
        map5.remove("Android");
        map5.forEach((k, v) -> System.out.printf("%s %s%n", k, v));

        // caso seja vazio
        Map<String,Integer> map6 = new HashMap<>(Map.of());
        Integer calculatedVaue = map6.computeIfAbsent("Java", it -> 7);
        System.out.println(calculatedVaue);

    }
}
