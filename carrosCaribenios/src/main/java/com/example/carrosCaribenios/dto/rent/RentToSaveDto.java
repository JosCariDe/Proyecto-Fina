package com.example.carrosCaribenios.dto.rent;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record RentToSaveDto(
        Long id,
        String ciudad,
        String modelo,
        String marca,
        LocalDateTime fechaInicio,
        LocalDateTime fechaFinal,
        Float precio
) {
}
