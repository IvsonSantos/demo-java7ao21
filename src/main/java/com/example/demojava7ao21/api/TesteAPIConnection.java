package com.example.demojava7ao21.api;

import com.example.demojava7ao21.api.Endereco;
import com.example.demojava7ao21.api.ServicoDeCep;

public class TesteAPIConnection {

    public static void main(String[] args) throws Exception {
        //System.out.print("Informe seu CEP: ");
        //String cep = new Scanner(System.in).nextLine();
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo("01001000");

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
    }
}
