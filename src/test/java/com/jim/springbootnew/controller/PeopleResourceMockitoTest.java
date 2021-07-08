package com.jim.springbootnew.controller;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.jim.springbootnew.model.Person;
import com.jim.springbootnew.resource.PersonResource;
import com.jim.springbootnew.service.PeopleService;

@SpringBootTest
public class PeopleResourceMockitoTest {
	
	@Mock
	private PeopleService peopleService;
	
	@InjectMocks
	private PersonResource personResource;
	
	@BeforeEach
	void setMockOutput() {
		List<Person> people = new ArrayList<>();
		people.add(new Person());
		people.add(new Person());
		people.add(new Person());
		people.add(new Person());
		
		when(peopleService.findAllPeople()).thenReturn(people);
	}
	
	
	@Test
	public void shouldReturnListPerson() {
		List<Person> allPeople = personResource.getAllPeople();
		assertThat(allPeople).asList();
	}
	

}
