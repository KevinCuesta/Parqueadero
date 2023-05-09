package com.example.Parqueadero.Modelo;
import javax.persistence.*;

@Entity
@Table(name = "espacios_parqueadero")
public class EspacioParqueadero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "entrada_vehiculo_id")
    private EntradaVehiculo entradaVehiculo;

    @Column(name = "disponible")
    private boolean disponible;

    public EspacioParqueadero() {}

    //Constructor con todos los campos
    public EspacioParqueadero(EntradaVehiculo entradaVehiculo) {
        this.entradaVehiculo = entradaVehiculo;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EntradaVehiculo getEntradaVehiculo() {
        return entradaVehiculo;
    }

    public void setEntradaVehiculo(EntradaVehiculo entradaVehiculo) {
        this.entradaVehiculo = entradaVehiculo;
    }
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
