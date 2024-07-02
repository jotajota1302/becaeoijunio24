package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
		
	@Autowired
	PersonRepository personRepository;	
	
	public PersonDto findPerson(int id) {
			
		Person entity = personRepository.findById(id).get();
		
		PersonDto dto=new PersonDto();
		dto.setApellidos(entity.getApellidos());
		dto.setNif(entity.getNif());
		dto.setNombre(entity.getNombre());
		dto.setDirecciones(new ArrayList<String>());
		
		for (Address address : entity.getDirecciones()) {
			
			dto.getDirecciones().add(address.toString());
		}		
			
		return dto;
		
	}

	@Override
	public List<PersonDto> findAll() {
	
		List<PersonDto> personas= new ArrayList<PersonDto>();
		
		List<Person> all = personRepository.findAll();
		
		for (Person person : all) {
			
			PersonDto dto=new PersonDto();
			dto.setApellidos(person.getApellidos());
			dto.setNif(person.getNif());
			dto.setNombre(person.getNombre());
			dto.setDirecciones(new ArrayList<String>());
			
			for (Address address : person.getDirecciones()) {
				
				dto.getDirecciones().add(address.toString());
			}		
			
			personas.add(dto);	
			
		}	
			
		return personas;
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
