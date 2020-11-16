package com.example.prueba;

import org.springframework.data.repository.CrudRepository;

import com.example.prueba.prueba;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PruebaRespository extends CrudRepository<prueba, Integer> {


	public prueba findByPrueba(String name);
}