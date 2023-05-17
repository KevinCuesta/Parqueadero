package com.example.Parqueadero.interfaceService;

import com.example.Parqueadero.modelo.EspacioParqueadero;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IespacioparqueoService {

    public List<EspacioParqueadero>listar1();
    public Optional<EspacioParqueadero>listarId1(int id);
    public int save1 (EspacioParqueadero a);
    public void delete1(int id);

}
