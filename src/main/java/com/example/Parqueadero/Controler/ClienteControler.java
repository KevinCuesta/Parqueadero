package com.example.Parqueadero.Controler;

import com.example.Parqueadero.InterfaceService.IClienteService;
import com.example.Parqueadero.Modelo.Cliente;
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
@RequestMapping("/clientes")
public class ClienteControler {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Cliente> clientes= clienteService.listar();
        model.addAttribute("clientes", clientes);
        return "clientes/index";
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("cliente", new Cliente());
        return "clientes/form";
    }

    @PostMapping("/save")
    public String save(@Validated Cliente cliente){
        clienteService.save(cliente);
        return "redirect:/clientes/listar";
    }

    @GetMapping("/editar/{cedula}")
    public String editar(@PathVariable String cedula, Model model){
        Optional<Cliente> cliente = clienteService.listarPorCedula(cedula);
        model.addAttribute("cliente", cliente);
        return "clientes/form";
    }

    @GetMapping("/eliminar/{cedula}")
    public String delete(@PathVariable String cedula){
        clienteService.delete(cedula);
        return "redirect:/clientes/listar";
    }
}
