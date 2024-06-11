package com.example.carrosCaribenios.dto.rent;

import com.example.carrosCaribenios.entitys.Client;
import lombok.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
public record RentDto(
        Long id,
        String ciudad,
        String modelo,
        String marca,
        LocalDate fechaInicio,
        LocalDate fechaFinal,
        Float precio,
        Client rentadoCliente
) {
}
