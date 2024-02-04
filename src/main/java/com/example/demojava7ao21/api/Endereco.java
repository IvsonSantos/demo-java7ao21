package com.example.demojava7ao21.api;

import lombok.Getter;

@Getter
public class Endereco {

    String logradouro;
    String bairro;
    String localidade;

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + '}';
    }

}
