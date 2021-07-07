package com.jim.springbootnew.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jim.springbootnew.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}