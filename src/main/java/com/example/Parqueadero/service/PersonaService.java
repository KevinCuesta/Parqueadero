package com.example.Parqueadero.service;

import com.example.Parqueadero.interfaceService.IPersonaService;
import com.example.Parqueadero.interfaces.IPersona;
import com.example.Parqueadero.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Optional<Persona> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Persona p) {
        int res = 0;
        Persona persona = data.save(p);
        if(!persona.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
            data.deleteById(id);
    }
}
