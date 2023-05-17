package com.example.Parqueadero.interfaces;

import com.example.Parqueadero.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ICliente extends CrudRepository<Cliente, Integer> {
}
