package com.example.demojava7ao21.repository;

import com.example.demojava7ao21.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Page<Person> findByNomeContaining(String nome, Pageable pageable);

}
