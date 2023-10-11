package com.example.demojava7ao21.loja;

import java.math.BigDecimal;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Teste {

    public static void main(String[] args) {

        Customer paulo = new Customer("Paulo Silveira");
        Customer rodrigo = new Customer("Rodrigo Turini");
        Customer guilherme = new Customer("Guilherme Silveira");
        Customer adriano = new Customer("Adriano Almeida");

        Product bach = new Product("Bach Completo", Paths.get("/music/bach.mp3"), new BigDecimal(100));
        Product poderosas = new Product("Poderosas Anita", Paths.get("/music/poderosas.mp3"), new BigDecimal(90));
        Product bandeira = new Product("Bandeira Brasil", Paths.get("/images/brasil.jpg"), new BigDecimal(50));
        Product beauty = new Product("Beleza Americana", Paths.get("beauty.mov"), new BigDecimal(150));
        Product vingadores = new Product("Os Vingadores", Paths.get("/movies/vingadores.mov"), new BigDecimal(200));
        Product amelie = new Product("Amelie Poulain", Paths.get("/movies/amelie.mov"), new BigDecimal(100));

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime yesterday = today.minusDays(1);
        LocalDateTime lastMonth = today.minusMonths(1);
        Payment payment1 = new Payment(Arrays.asList(bach, poderosas), today, paulo);
        Payment payment2 = new Payment(Arrays.asList(bach, bandeira, amelie), yesterday, rodrigo);
        Payment payment3 = new Payment(Arrays.asList(beauty, vingadores, bach), today, adriano);
        Payment payment4 = new Payment(Arrays.asList(bach, poderosas, amelie), lastMonth, guilherme);
        Payment payment5 = new Payment(Arrays.asList(beauty, amelie), yesterday, paulo);

        List<Payment> payments = Arrays.asList(payment1, payment2, payment3, payment4, payment5);

        // ordenar por data
        payments.stream().sorted(Comparator.comparing(Payment::getDate)).forEach(System.out::println);

        payment1.getProducts().stream().map(Product::getPrice).reduce(BigDecimal::add).ifPresent(System.out::println);

        // somando BigDecimal
        BigDecimal total = payment1.getProducts().stream().map(Product::getPrice).reduce(BigDecimal.ZERO,
                BigDecimal::add);

//		E a soma do valor por produto
        Map<Product, BigDecimal> totalValuePerProduct = payments.stream().flatMap(p -> p.getProducts().stream())
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.reducing(BigDecimal.ZERO, Product::getPrice, BigDecimal::add)));

        totalValuePerProduct.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(System.out::println);

        // Relatórios com datas
        Map<YearMonth, List<Payment>> paymentsPerMonth = payments.stream()
                .collect(Collectors.groupingBy(p -> YearMonth.from(p.getDate())));

        paymentsPerMonth.entrySet().stream().forEach(System.out::println);

        // se quisermos saber, também por mês, quanto foi faturado na loja
        Map<YearMonth, BigDecimal> paymentsValuePerMonth = payments.stream()
                .collect(Collectors.groupingBy(p -> YearMonth.from(p.getDate()), Collectors.reducing(BigDecimal.ZERO,
                        p -> p.getProducts().stream().map(Product::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add),
                        BigDecimal::add)));
        System.out.println(paymentsValuePerMonth);
    }

}
