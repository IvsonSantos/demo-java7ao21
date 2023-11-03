package com.example.demojava7ao21.mocks;

import com.example.demojava7ao21.model.Person;
import com.example.demojava7ao21.repository.PersonRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockPerson {

    @MockBean
    private PersonRepository personRepository;

    @Test
    public void testRepository() {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Mock aaa", null, null));
        persons.add(new Person(2, "Mock bbb", null, null));
        Mockito.when(personRepository.findAll()).thenReturn(persons);

        Pageable pageRequest = PageRequest.of(0, 1);
        List<Person> list = personRepository.findAll();
        int start = (int) pageRequest.getOffset();
        int end = Math.min((start + pageRequest.getPageSize()), list.size());
        List<Person> pageContent = list.subList(start, end);

        Page<Person> page = new PageImpl<>(pageContent, pageRequest, list.size());

        Assertions.assertNotNull(page);
    }

}
