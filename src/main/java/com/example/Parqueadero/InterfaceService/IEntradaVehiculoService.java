package com.example.Parqueadero.InterfaceService;

import com.example.Parqueadero.Modelo.EntradaVehiculo;

import java.util.List;
import java.util.Optional;

public interface IEntradaVehiculoService {

    public List<EntradaVehiculo>listar();
    public Optional<EntradaVehiculo>listarPorPlaca(String placa);
    public int save(EntradaVehiculo entradaVehiculo);
    public void delete(String placa);
}
