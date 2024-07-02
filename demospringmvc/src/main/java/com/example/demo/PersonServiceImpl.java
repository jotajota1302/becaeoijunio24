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
		dto.setApellidos(entity.getApellidos().toUpperCase());
		dto.setNif(entity.getNif());
		dto.setNombre(entity.getNombre().toUpperCase());
		dto.setDirecciones(new ArrayList<String>());
		dto.setPostalCode(entity.getCodigopostal());
		
//		for (Address address : entity.getDirecciones()) {
//			
//			dto.getDirecciones().add(address.toString());
//		}		
			
		return dto;
		
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
