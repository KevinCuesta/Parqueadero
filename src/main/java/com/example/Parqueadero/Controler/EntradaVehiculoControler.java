package com.example.Parqueadero.Controler;

import com.example.Parqueadero.InterfaceService.IEntradaVehiculoService;
import com.example.Parqueadero.Modelo.EntradaVehiculo;
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
@RequestMapping("/entradas-vehiculos")
public class EntradaVehiculoControler {

    @Autowired
    private IEntradaVehiculoService entradaVehiculoService;

    @GetMapping("/listar")
    public String listar(Model model){
        List<EntradaVehiculo> entradas= entradaVehiculoService.listar();
        model.addAttribute("entradas", entradas);
        return "entradas-vehiculos/index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("entrada", new EntradaVehiculo());
        return "entradas-vehiculos/form";
    }

    @PostMapping("/save")
    public String save(@Validated EntradaVehiculo entradaVehiculo){
        entradaVehiculoService.save(entradaVehiculo);
        return "redirect:/entradas-vehiculos/listar";
    }

    @GetMapping("/editar/{placa}")
    public String editar(@PathVariable String placa, Model model){
        Optional<EntradaVehiculo> entrada = entradaVehiculoService.listarPorPlaca(placa);
        model.addAttribute("entrada", entrada);
        return "entradas-vehiculos/form";
    }

    @GetMapping("/eliminar/{placa}")
    public String delete(@PathVariable String placa){
        entradaVehiculoService.delete(placa);
        return "redirect:/entradas-vehiculos/listar";
    }
}
