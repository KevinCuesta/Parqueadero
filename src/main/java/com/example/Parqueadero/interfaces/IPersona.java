package com.example.Parqueadero.interfaces;

import com.example.Parqueadero.modelo.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersona  extends CrudRepository<Persona, Integer> {
}
