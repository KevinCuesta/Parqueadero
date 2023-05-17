package com.example.Parqueadero.interfaces;

import com.example.Parqueadero.modelo.EspacioParqueadero;
import org.springframework.data.repository.CrudRepository;

public interface IEspacioParqueadero extends CrudRepository<EspacioParqueadero, Integer> {
}
