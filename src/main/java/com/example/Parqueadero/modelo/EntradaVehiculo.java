package com.example.Parqueadero.modelo;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "entradas_vehiculos")
public class EntradaVehiculo {

    @Id
    @Column(name = "placa")
    private String placa;

    @Column(name = "fecha_entrada")
    private LocalDateTime fechaEntrada;

    @ManyToOne
    @JoinColumn(name = "cliente_cedula")
    private Cliente cliente;

    @OneToMany(mappedBy = "entradaVehiculo")
    private List<EspacioParqueadero> espaciosParqueadero = new ArrayList<>();

    public EntradaVehiculo() {}

    public EntradaVehiculo(String placa, LocalDateTime fechaEntrada, Cliente cliente) {
        this.placa = placa;
        this.fechaEntrada = fechaEntrada;
        this.cliente = cliente;
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