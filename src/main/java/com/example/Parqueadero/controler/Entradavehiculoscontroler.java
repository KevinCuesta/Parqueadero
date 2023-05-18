package com.example.Parqueadero.controler;


import com.example.Parqueadero.interfaceService.IentradavehiculoService;


import com.example.Parqueadero.modelo.EntradaVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Entradavehiculoscontroler {


    @Autowired
    private IentradavehiculoService service;


    @GetMapping("/listar2")
    public String listar2(Model model){
        List<EntradaVehiculo>vehiculos= service.listar2();
        model.addAttribute("vehiculos", vehiculos);
        return "listaregistro";
    }

    @GetMapping("/registo/Entrada")
    public String agregar4(Model model){
        model.addAttribute("EntradaVehiculo", new EntradaVehiculo());
        return "registroentrada";
    }
    @GetMapping("/registro/salida")
    public String agregar5(Model model){
        model.addAttribute("EntradaVehiculo",new EntradaVehiculo());
        return "registrosalida";
    }

    @GetMapping("/espacio/parqueo")
    public String agregar6(Model model){
        model.addAttribute("EntradaVehiculo", new EntradaVehiculo());
        return "espacioparqueadero";
    }

    @PostMapping("/save2")
    public String save2(@Validated EntradaVehiculo c){
        service.save2(c);
        return "inicio";
    }

    @GetMapping("/editar2/{id}")
    public String editar2(@PathVariable int cedula, Model model){
        Optional<EntradaVehiculo> vehiculos = service.listarId2(cedula);
        model.addAttribute("vehiculos", vehiculos);
        return "registroentrada";
    }

    @GetMapping("/eliminar2/{cedula}")
    public String delete2(@PathVariable int cedula){
        service.delete2(cedula);
        return "redirect:/listar";
    }

    
}
