package com.example.demojava7ao21.mocks;

import com.example.demojava7ao21.model.Person;
import com.example.demojava7ao21.service.PersonService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceImplIntegrationTest {

    @Autowired
    private PersonService personService;

    @Test
    public void teste() {
        Page<Person> page = personService.findByPerson("ivson", 0);
        Assertions.assertNotNull(page);
    }

    /*
    @Test
    public void testRepository() {
        Page<Person> page = personService.findByPerson("ivson", 0);

        Mockito.when(personRepository.findByNomeContaining(Mockito.anyString(), Mockito.any()))
                .thenReturn(page);

        Page<Person> list = personRepository.findByNomeContaining("teste", Pageable.ofSize(4));

        Assertions.assertNotNull(list);
    }

     */

}
