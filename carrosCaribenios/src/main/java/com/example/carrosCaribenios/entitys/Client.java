package com.example.carrosCaribenios.entitys;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@Table(name = "clientes")
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carrosRentados",
                referencedColumnName = "id")
    private RentedCarsClient carrosRentados;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false)
    private Integer cedula;
    private String correo;
    private Integer numeroCelular;

}
