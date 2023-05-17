package com.example.Parqueadero.interfaceService;

import com.example.Parqueadero.modelo.EntradaVehiculo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IentradavehiculoService {

    public List<EntradaVehiculo>listar2();
    public Optional<EntradaVehiculo>listarId2(int id);
    public int save2 (EntradaVehiculo c);
    public void delete2(int idr);

}
