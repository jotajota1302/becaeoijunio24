package com.example.demo;

import java.util.List;

public interface PersonService {	
	
	public List<Person> findAll();
	
	public PersonDto findPerson(int id);

	public void save(Person person);

	public void deleteAll();

	public void delete(Integer id);

}