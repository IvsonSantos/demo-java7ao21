package com.example.demojava7ao21.deitel.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    public static void main(String[] args) {

        // cria expressão regular
        // A expressão identifica somente aniversários que não ocorram em abril e que pertençam às pessoas cujos nomes
        // iniciam com "J".
        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");

        String string1 = "Jane's Birthday is 05-12-75\n" +
                "Dave's Birthday is 11-04-68\n" +
                "Jesus's Birthday is 04-28-73\n" +
                "Joana's Birthday is 12-17-77";

        // corresponde expressão regular à string e imprime as correspondências
        Matcher matcher = expression.matcher(string1);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
