package com.example.Parqueadero.service;

import com.example.Parqueadero.interfaceService.IentradavehiculoService;
import com.example.Parqueadero.interfaces.IEntradaVehiculo;
import com.example.Parqueadero.modelo.EntradaVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntradaVehiculoService implements IentradavehiculoService {

    @Autowired
    private IEntradaVehiculo datos;

    @Override
    public List<EntradaVehiculo> listar2() {
        return (List<EntradaVehiculo>) datos.findAll();
    }

    @Override
    public Optional<EntradaVehiculo> listarId2(int id) {

        return datos.findById(id);
    }

    @Override
    public int save2(EntradaVehiculo c) {
        int res = 0;
        EntradaVehiculo entradaVehiculo = datos.save(c);
        if(!entradaVehiculo.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete2(int id) {
            datos.deleteById(id);
    }
}
