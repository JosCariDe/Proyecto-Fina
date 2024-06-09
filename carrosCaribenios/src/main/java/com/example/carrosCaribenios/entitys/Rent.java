package com.example.carrosCaribenios.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "rentados")
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String ciudad;
    @OneToOne
    @JoinColumn(name = "carro_id",
                referencedColumnName = "id")
    private Car carro;
    @Column(nullable = false)
    private LocalDateTime fechaInicio;
    @Column(nullable = false)
    private LocalDateTime fechaFinal;
    @Column(nullable = false)
    private Float precio;
    @ManyToOne
    @JoinColumn(name = "rentado_id",
                referencedColumnName = "id")
    private RentedCarsClient rentadoCliente;
}
