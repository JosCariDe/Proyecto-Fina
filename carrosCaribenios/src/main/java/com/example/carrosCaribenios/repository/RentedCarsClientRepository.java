package com.example.carrosCaribenios.repository;

import com.example.carrosCaribenios.entitys.RentedCarsClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentedCarsClientRepository extends JpaRepository<RentedCarsClient, Long> {
    //List<RentedCarsClient> findByCliente(Client cliente);
}
