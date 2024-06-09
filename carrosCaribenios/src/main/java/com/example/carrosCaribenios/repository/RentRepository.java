package com.example.carrosCaribenios.repository;

import com.example.carrosCaribenios.entitys.Car;
import com.example.carrosCaribenios.entitys.Client;
import com.example.carrosCaribenios.entitys.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface RentRepository extends JpaRepository<Rent, Long> {
    List<Rent> findByFechaInicioBetween(LocalDateTime fechaInicio, LocalDateTime fechaFinal);
    List<Rent> findByCarro(Car carro);
    List<Rent> findByCliente(Client cliente);
}
