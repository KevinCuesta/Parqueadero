package com.example.Parqueadero.controler;



import com.example.Parqueadero.interfaceService.IclienteService;
import com.example.Parqueadero.modelo.Cliente;
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
public class ClienteControler {


    @Autowired
    private IclienteService servi;


    @GetMapping("/listar3")
    public String listar3(Model modelo){
        List<Cliente>clientes= servi.listar3();
        modelo.addAttribute("cliente", clientes);
        return "listacliente";
    }

    @GetMapping("/registrocliente")
    public String agregar1(Model modelo){
        modelo.addAttribute("cliente",new Cliente());
        return "registrocliente";
    }
    @GetMapping("/inicio")
    public String agregar2(Model modelo){
        return "inicio";
    }

    @PostMapping("/save3")
    public String save3(@Validated Cliente p){
        servi.save3(p);
        return "redirect:/listar3";
    }

    @GetMapping("/editar3/{cedula}")
    public String editar3(@PathVariable int cedula, Model modelo){
        Optional<Cliente> cliente = servi.listarcedula(cedula);
        modelo.addAttribute("cliente",cliente );
        return "form";
    }

    @GetMapping("/eliminar3/{id}")
    public String delete3(@PathVariable int id){
        servi.delete3(id);
        return "redirect:/listar";
    }



}
