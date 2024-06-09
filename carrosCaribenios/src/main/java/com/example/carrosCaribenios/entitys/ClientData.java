package com.example.carrosCaribenios.entitys;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "DatosCLientes")
public class ClientData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private Integer cedula;
    private String correo;
    private Integer numeroCelular;
    @OneToOne(mappedBy = "datosCliente")
    private Client cliente;
}
