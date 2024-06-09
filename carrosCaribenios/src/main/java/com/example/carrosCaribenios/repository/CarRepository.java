package com.example.carrosCaribenios.repository;

import com.example.carrosCaribenios.entitys.Car;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByMarca(String marca);
}
