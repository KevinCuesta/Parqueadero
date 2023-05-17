package com.example.Parqueadero.interfaces;

import com.example.Parqueadero.modelo.EntradaVehiculo;
import org.springframework.data.repository.CrudRepository;

public interface IEntradaVehiculo extends CrudRepository<EntradaVehiculo, Integer> {
}
