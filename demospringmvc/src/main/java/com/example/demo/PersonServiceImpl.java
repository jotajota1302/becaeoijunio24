package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
		
	@Autowired
	PersonRepository personRepository;	
	
	public Person findPerson(int id) {
			
		return personRepository.findById(id).get();
		
	}

	@Override
	public List<Person> findAll() {
	
		return personRepository.findAll();
	}

	@Override
	public void save(Person person) {
		
		personRepository.save(person);
		
	}

	@Override
	public void deleteAll() {
		
		personRepository.deleteAll();
		
	}

	@Override
	public void delete(Integer id) {
		
		personRepository.deleteById(id);
		
	}
	
}
