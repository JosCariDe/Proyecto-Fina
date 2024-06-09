package com.example.carrosCaribenios.repository;

import com.example.carrosCaribenios.entitys.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface RentRepository extends JpaRepository<Rent, Long> {
    @Query("SELECT r FROM Rent r WHERE r.ciudad = :ciudad AND r.fechaInicio <= :fechaFinal AND r.fechaFinal >= :fechaInicio")
    List<Rent> findCarsFilters(@Param("ciudad") String ciudad, @Param("fechaInicio") LocalDateTime fechaInicio, @Param("fechaFinal") LocalDateTime fechaFinal);
}
