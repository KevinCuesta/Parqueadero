package com.example.Parqueadero.Service;

import com.example.Parqueadero.InterfaceService.IEspacioParqueaderoService;
import com.example.Parqueadero.Interfaces.IEspacioParqueadero;
import com.example.Parqueadero.Modelo.EspacioParqueadero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspacioParqueaderoService implements IEspacioParqueaderoService {

    @Autowired
    private IEspacioParqueadero repositorio;

    @Override
    public List<EspacioParqueadero> listar() {
        return (List<EspacioParqueadero>) repositorio.findAll();
    }

    @Override
    public Optional<EspacioParqueadero> listarPorId(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public int save(EspacioParqueadero espacioParqueadero) {
        EspacioParqueadero e = repositorio.save(espacioParqueadero);
        if (e == null) {
            return 0;
        }
        return 1;
    }

    @Override
    public void delete(Long id) {
        repositorio.deleteById(id);
    }

}
