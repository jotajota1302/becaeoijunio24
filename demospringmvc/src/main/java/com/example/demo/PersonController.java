package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService personService;

	@GetMapping
	public List<Person> findAll() {

		return personService.findAll();
	}

	@GetMapping("/{id}")
	public Person find(@PathVariable Integer id) {

		return personService.findPerson(id);
	}

	@PostMapping
	public void create(@RequestBody Person person) {

		personService.save(person);
	}

	@DeleteMapping
	public void deleteAll() {

		personService.deleteAll();
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {

		personService.delete(id);
	}

	@PutMapping("/{id}")
	public void update(@RequestBody Person person, @PathVariable Integer id) {

		if (id.equals(person.getId())) {
			personService.save(person);
		} else {
			System.out.println("Bad Request");
		}
	}

}
