package com.example.carrosCaribenios.repository;

import com.example.carrosCaribenios.entitys.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentedCarsClient extends JpaRepository<RentedCarsClient, Long> {
    List<RentedCarsClient> findByCliente(Client cliente);
    void deleteByIdCarrosRentadosCliente(Long idCarrosRentadosCliente);
}
