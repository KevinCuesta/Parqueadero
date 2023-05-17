package com.example.Parqueadero.modelo;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "entradas_vehiculos")
public class EntradaVehiculo {

    @Id
    private String placa;
    private LocalDateTime fechaEntrada;
    private String tipo;
    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "entradaVehiculo")
    private List<EspacioParqueadero> espaciosParqueadero = new ArrayList<>();

    public EntradaVehiculo() {}

    public EntradaVehiculo(String placa, LocalDateTime fechaEntrada, Cliente cliente,String tipo) {
        this.placa = placa;
        this.fechaEntrada = fechaEntrada;
        this.cliente = cliente;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEspaciosParqueadero(List<EspacioParqueadero> espaciosParqueadero) {
        this.espaciosParqueadero = espaciosParqueadero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<EspacioParqueadero> getEspaciosParqueadero() {
        return espaciosParqueadero;
    }

    public void addEspacioParqueadero(EspacioParqueadero espacio) {
        this.espaciosParqueadero.add(espacio);
        espacio.setEntradaVehiculo(this);
    }

    public void removeEspacioParqueadero(EspacioParqueadero espacio) {
        this.espaciosParqueadero.remove(espacio);
        espacio.setEntradaVehiculo(null);
    }
}