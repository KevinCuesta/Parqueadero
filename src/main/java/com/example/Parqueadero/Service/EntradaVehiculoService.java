package com.example.Parqueadero.Service;

import com.example.Parqueadero.Interfaces.IEntradaVehiculo;
import com.example.Parqueadero.InterfaceService.IEntradaVehiculoService;
import com.example.Parqueadero.Modelo.EntradaVehiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntradaVehiculoService implements IEntradaVehiculoService {

    @Autowired
    private IEntradaVehiculo entradaVehiculoRepository;

    @Override
    public List<EntradaVehiculo> listar() {
        return (List<EntradaVehiculo>) entradaVehiculoRepository.findAll();
    }

    @Override
    public Optional<EntradaVehiculo> listarPorPlaca(String placa) {
        return Optional.empty();
    }


    @Override
    public int save(EntradaVehiculo entradaVehiculo) {
        int res = 0;
        EntradaVehiculo entVeh = entradaVehiculoRepository.save(entradaVehiculo);
        if(!entVeh.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(String placa) {

    }

}
