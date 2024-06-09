package com.example.carrosCaribenios.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "clientes")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn( name = "clienteDatos_id" ,
                referencedColumnName = "id")
    private ClientData datosCliente;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carrosRentados",
                referencedColumnName = "id")
    private RentedCarsClient carrosRentados;
}
