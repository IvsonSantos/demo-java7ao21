package com.example.demojava7ao21.repository;

import com.example.demojava7ao21.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Page<Person> findByNomeContaining(String nome, Pageable pageable);

    @Query(value = "SELECT * FROM Person p WHERE p.nome = 'ivson ddd'", nativeQuery = true)
    Collection<Person> findAllUsers();

    @Query(value = "SELECT p FROM Person p WHERE p.nome = 'ivson fff'")
    Collection<Person> findAllUsers2();

    @Query(value = "SELECT p FROM Person p ORDER BY id")
    Page<Person> findAllPersonWithPagination(Pageable pageable);

    @Query(value = "SELECT p FROM Person p WHERE p.nome = :name")
    Page<Person> findAllPersonWithPaginationParameter(Pageable pageable, @Param("name") String nome);

}
