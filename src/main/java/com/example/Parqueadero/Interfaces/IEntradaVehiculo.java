package com.example.Parqueadero.Interfaces;

import com.example.Parqueadero.Modelo.Cliente;
import com.example.Parqueadero.Modelo.EntradaVehiculo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IEntradaVehiculo extends CrudRepository<EntradaVehiculo, String> {

    List<EntradaVehiculo> findByClienteCedula(String cedula);

}
