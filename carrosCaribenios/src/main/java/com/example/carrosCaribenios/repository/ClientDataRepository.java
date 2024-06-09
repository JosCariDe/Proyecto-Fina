package com.example.carrosCaribenios.repository;

import com.example.carrosCaribenios.entitys.Client;
import com.example.carrosCaribenios.entitys.ClientData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDataRepository extends JpaRepository<ClientData, Long> {
    Client findByDatosCliente(ClientData datosCliente);
}
