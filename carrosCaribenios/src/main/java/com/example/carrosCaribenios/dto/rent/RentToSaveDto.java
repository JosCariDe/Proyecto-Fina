package com.example.carrosCaribenios.dto.rent;

import com.example.carrosCaribenios.dto.car.CarDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;

import java.time.LocalDateTime;

public record RentToSaveDto(
        Long id,
        String ciudad,
        CarDto carro,
        LocalDateTime fechaInicio,
        LocalDateTime fechaFinal,
        Float precio
) {
}
