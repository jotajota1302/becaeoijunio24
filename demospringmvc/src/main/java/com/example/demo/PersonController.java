package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Person>> findAll() {

		return ResponseEntity.ok(personService.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Person> find(@PathVariable Integer id) {

		try {
			Person p=personService.findPerson(id);
			return new ResponseEntity<Person>(p,HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<Person>(HttpStatus.NOT_FOUND);
		}
		
	}

	@PostMapping
	public ResponseEntity<String> create(@RequestBody Person person) {

		try {
			personService.save(person);
			return new ResponseEntity<String>(HttpStatus.CREATED);			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}				
	}

	@DeleteMapping
	public ResponseEntity<String> deleteAll() {

		personService.deleteAll();
		
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);		
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {

		personService.delete(id);
		
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Person person, @PathVariable Integer id) {

		if (id.equals(person.getId())) {
			personService.save(person);
			return new ResponseEntity<Person>(HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<String>(HttpStatus.CREATED);
		}
	}

}
