package com.example.Parqueadero.modelo;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "entradas_vehiculos")
public class EntradaVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String placa;
    private String fechaEntrada;
    private String tipo;
    private long cliente;
    private int espaciosParqueadero;

    public EntradaVehiculo() {}

    public EntradaVehiculo(int id, String placa, String fechaEntrada, long cliente,String tipo,int espaciosParqueadero) {
        this.id=id;
        this.placa = placa;
        this.fechaEntrada = fechaEntrada;
        this.cliente = cliente;
        this.tipo=tipo;
        this.espaciosParqueadero=espaciosParqueadero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public long getCliente() {
        return cliente;
    }

    public void setCliente(long cliente) {
        this.cliente = cliente;
    }

    public int getEspaciosParqueadero() {
        return espaciosParqueadero;
    }

    public void setEspaciosParqueadero(int espaciosParqueadero) {
        this.espaciosParqueadero = espaciosParqueadero;
    }
}