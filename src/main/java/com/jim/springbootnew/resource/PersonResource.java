package com.jim.springbootnew.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jim.springbootnew.model.Person;
import com.jim.springbootnew.repo.PersonRepository;

@RestController
@RequestMapping(value ="/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonResource {
	
	@Autowired
	private PersonRepository personRepo;
	
	@GetMapping("/people")
	public List<Person> getAllPeople(){
		return getPersonRepo().findAll();
	}
	
	
	public PersonRepository getPersonRepo() {
		return this.personRepo;
	}
	

}
