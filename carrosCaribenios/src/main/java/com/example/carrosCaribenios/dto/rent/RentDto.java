package com.example.carrosCaribenios.dto.rent;

import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record RentDto(
        Long id,
        String ciudad,
        String modelo,
        String marca,
        LocalDateTime fechaInicio,
        LocalDateTime fechaFinal,
        Float precio,
        RentedCarsClientDto rentadoCliente
) {
}
