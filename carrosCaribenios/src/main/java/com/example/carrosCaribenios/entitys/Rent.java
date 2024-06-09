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
    @OneToOne
    @JoinColumn(name = "carro_id",
                referencedColumnName = "id")
    private Car carro;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinal;
    private Float precio;
    private Boolean rentado;
    @ManyToOne
    @JoinColumn(name = "rentado_id",
                referencedColumnName = "id")
    private RentedCarsClient rentadoCliente;
}
