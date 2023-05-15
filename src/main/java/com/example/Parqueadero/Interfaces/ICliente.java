package com.example.Parqueadero.Interfaces;

import com.example.Parqueadero.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ICliente extends CrudRepository<Cliente, String> {
    List<Cliente> findByNombreContainingIgnoreCase(String nombre);
}
