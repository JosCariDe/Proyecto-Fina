package com.example.carrosCaribenios.repository;

import com.example.carrosCaribenios.entitys.Client;
import com.example.carrosCaribenios.entitys.Rent;
import com.example.carrosCaribenios.entitys.RentedCarsClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RentedCarsClientRepository extends JpaRepository<RentedCarsClient, Long> {
    @Query("SELECT r FROM Rent r JOIN r.rentadoCliente rc WHERE rc.cliente.id = :clientId")
    List<Rent> findRentedCarsByClientId(Long clientId);
}
