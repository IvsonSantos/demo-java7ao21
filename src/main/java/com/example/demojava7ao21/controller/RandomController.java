package com.example.demojava7ao21.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/teste")
public class RandomController {

    @Value("${random.int}")
    private int numero;

    @Value("#{${valuesMap}.key2}")
    private Integer valuesMapKey2;

    @Value("#{${valuesMap}['unknownKey'] ?: 5}")
    private Integer unknownMapKeyWithDefaultValue;

    @Value("#{${valuesMap}}")
    private Map<String, Integer> valuesMap;

    @Value("#{${valuesMap}.?[value>'1']}")
    private Map<String, Integer> valuesMapFiltered;

    @GetMapping
    public int getNumero() {
        return this.numero;
    }

    // retorna valor do MAP
    @GetMapping("/maps")
    public Map<String, Integer> getMaps() {
        return valuesMap;
    }

    // retorna valor do MAP 2
    @GetMapping("/maps2")
    public Integer getMapsKey2() {
        return valuesMapKey2;
    }

    @GetMapping("/maps5")
    public Integer getMapsKey5() {
        return unknownMapKeyWithDefaultValue;
    }

    @GetMapping("/mapsFiltered")
    public Map<String, Integer> getMapsFilteres() {
        return valuesMapFiltered;
    }


}
