package com.example.demojava7ao21.service;

import com.example.demojava7ao21.model.Person;
import com.example.demojava7ao21.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Page<Person> findByPerson(String nome, int pagina) {

        Pageable firstPageWithTwoElements = PageRequest.of(pagina, 2, Sort.by("nome").descending());

        return repository.findByNomeContaining(nome, firstPageWithTwoElements);
    }

}
