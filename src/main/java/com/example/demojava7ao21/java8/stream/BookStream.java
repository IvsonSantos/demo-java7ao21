package com.example.demojava7ao21.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BookStream {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));

        Map<String, String> listToMap = bookList.stream()
            .collect(Collectors.toMap(Book::getIsbn, Book::getName));

        System.out.println(listToMap);


        // duplicate key exception
        //Map<Integer, String> listToMapWithDuplicationKey = bookList.stream()
        //        .collect(Collectors.toMap(Book::getReleaseYear, Book::getName));

        // to solve it
        Map<Integer, Book> listToMapWithDuplicationKey = bookList.stream()
                .collect(Collectors.toMap(Book::getReleaseYear, Function.identity(), (existing, replacement) -> existing));


        System.out.println(listToMapWithDuplicationKey);
    }

}
