package com.example.demojava7ao21.mocks;

import com.example.demojava7ao21.model.Person;
import com.example.demojava7ao21.repository.PersonRepository;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockPerson {

    @MockBean
    private PersonRepository personRepository;

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

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

    @Test
    public void givenTotalCustomers20_whenGetRequestWithPageAndSize_thenPagedReponseIsReturnedFromDesiredPageAndSize() throws Exception {

        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/person")
                .accept(MediaType.APPLICATION_JSON))
            //.andExpect(status().isOk())
            //.andExpect(MockMvcResultMatchers.jsonPath("$.person").exists())
            //.andExpect(MockMvcResultMatchers.jsonPath("$.id").value(1))
            .andReturn();

        MockHttpServletResponse response = result.getResponse();

        JSONObject jsonObject = new JSONObject(response.getContentAsString());
        /*assertThat(jsonObject.get("totalPages")).isEqualTo(4);
        assertThat(jsonObject.get("totalElements")).isEqualTo(20);
        assertThat(jsonObject.get("number")).isEqualTo(1);
        assertThat(jsonObject.get("size")).isEqualTo(5);
        assertThat(jsonObject.get("content")).isNotNull();

         */
    }

}
