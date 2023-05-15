package com.example.Parqueadero.InterfaceService;

import com.example.Parqueadero.Modelo.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {

    public List<Cliente> listar();
    public Optional<Cliente> listarPorCedula(String cedula);
    public int save(Cliente cliente);
    public void delete(String cedula);
}
