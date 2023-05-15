package com.example.Parqueadero.InterfaceService;

import com.example.Parqueadero.Modelo.EspacioParqueadero;

import java.util.List;
import java.util.Optional;

public interface IEspacioParqueaderoService {

    public List<EspacioParqueadero> listar();
    public Optional<EspacioParqueadero> listarPorId(Long id);
    public int save(EspacioParqueadero espacioParqueadero);
    public void delete(Long id);
}
