package com.example.demojava7ao21.controller;

import com.example.demojava7ao21.dto.PersonDto;
import com.example.demojava7ao21.model.Person;
import com.example.demojava7ao21.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@Slf4j
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @PostMapping
    public ResponseEntity<Person> save() {
        Person person = new Person();
        person.setNome("Teste");
        repository.save(person);
        return ResponseEntity.ok(person);
    }

    @GetMapping
    public ResponseEntity<PersonDto> getDto() {
        PersonDto dto = new PersonDto();
        dto.setBooleanValue(true);
        dto.setStringValue("string");
        dto.setIntValue(2);
        dto.setName("nome");
        return ResponseEntity.ok(dto);

    }

}
