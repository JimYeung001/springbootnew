package com.jim.springbootnew.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jim.springbootnew.model.Person;
import com.jim.springbootnew.repo.PersonRepository;
import com.jim.springbootnew.service.PeopleService;

@Service
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	private PersonRepository personRepo;

	@Override
	public List<Person> findAllPeople() {
		return getPersonRepo().findAll();
	}

	public PersonRepository getPersonRepo() {
		return this.personRepo;
	}

}
