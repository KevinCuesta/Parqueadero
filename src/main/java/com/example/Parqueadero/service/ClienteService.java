package com.example.Parqueadero.service;

import com.example.Parqueadero.interfaceService.IclienteService;
import com.example.Parqueadero.interfaces.ICliente;
import com.example.Parqueadero.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IclienteService {

    @Autowired
    private ICliente datas;

    @Override
    public List<Cliente> listar3() {
        return (List<Cliente>) datas.findAll();
    }

    @Override
    public Optional<Cliente> listarId3(int id) {

        return datas.findById(id);
    }

    @Override
    public int save3(Cliente p) {
        int res = 0;
        Cliente espacioParqueadero = datas.save(p);
        if(!espacioParqueadero.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete3(int id) {
            datas.deleteById(id);
    }
}
