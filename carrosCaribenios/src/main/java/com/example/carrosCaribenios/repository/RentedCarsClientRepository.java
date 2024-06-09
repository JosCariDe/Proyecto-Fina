package com.example.carrosCaribenios.repository;

import com.example.carrosCaribenios.entitys.Client;
import com.example.carrosCaribenios.entitys.Rent;
import com.example.carrosCaribenios.entitys.RentedCarsClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RentedCarsClientRepository extends JpaRepository<RentedCarsClient, Long> {
    @Query("SELECT rcc FROM RentedCarsClient rcc WHERE rcc.cliente.id = :clientId")
    List<RentedCarsClient> findRentedCarsByClientId(Long clientId);
}
