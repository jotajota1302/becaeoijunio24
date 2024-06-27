package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

	public Client findByNif(String nif);

	public Client findByNombreAndApellidos(String nombre, String apellidos);

}
