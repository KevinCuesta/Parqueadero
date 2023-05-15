package com.example.Parqueadero.Service;

import com.example.Parqueadero.Interfaces.ICliente;
import com.example.Parqueadero.InterfaceService.IClienteService;
import com.example.Parqueadero.Modelo.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ICliente clienteRepository;

    @Override
    public List<Cliente> listar() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> listarPorCedula(String cedula) {
        return clienteRepository.findById(cedula);
    }

    @Override
    public int save(Cliente cliente) {
        int res = 0;
        Cliente cli = clienteRepository.save(cliente);
        if(!cli.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(String cedula) {
        clienteRepository.deleteById(cedula);
    }
}
