package com.example.carrosCaribenios.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "carros")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String marca;
    @OneToOne(mappedBy = "carro")
    private Rent rentar;
}
