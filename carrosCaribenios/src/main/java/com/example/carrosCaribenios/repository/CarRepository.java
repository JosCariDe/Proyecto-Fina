package com.example.carrosCaribenios.repository;

import com.example.carrosCaribenios.entitys.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}
