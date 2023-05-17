package com.example.Parqueadero.service;

import com.example.Parqueadero.interfaceService.IespacioparqueoService;
import com.example.Parqueadero.interfaces.IEspacioParqueadero;
import com.example.Parqueadero.modelo.EspacioParqueadero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EspacioParqueaderoService implements IespacioparqueoService {

    @Autowired
    private IEspacioParqueadero data;

    @Override
    public List<EspacioParqueadero> listar1() {
        return (List<EspacioParqueadero>) data.findAll();
    }

    @Override
    public Optional<EspacioParqueadero> listarId1(int id) {

        return data.findById(id);
    }

    @Override
    public int save1(EspacioParqueadero a) {
        int res = 0;
        EspacioParqueadero espacioParqueadero = data.save(a);
        if(!espacioParqueadero.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete1(int id) {
            data.deleteById(id);
    }
}
