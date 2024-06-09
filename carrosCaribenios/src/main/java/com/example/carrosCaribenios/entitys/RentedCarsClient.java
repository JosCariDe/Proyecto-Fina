package com.example.carrosCaribenios.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "rentadosPorClientes")
public class RentedCarsClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "carrosRentados")
    private Client cliente;
    @OneToMany(mappedBy = "rentadoCliente")
    private Set<Rent> carrosRentado;
}