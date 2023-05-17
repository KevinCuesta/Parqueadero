package com.example.Parqueadero.interfaceService;

import com.example.Parqueadero.modelo.Cliente;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IclienteService {

    public List<Cliente>listar3();
    public Optional<Cliente>listarcedula(int cedula);
    public int save3 (Cliente p);
    public void delete3(int cedula);

}
