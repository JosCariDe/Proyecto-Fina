package com.example.carrosCaribenios.dto.rentedCarsClient;

import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.entitys.Client;

import java.util.List;
import java.util.Set;

public record RentedCarsClientDto(
        Long id,
        Client cliente,
        List<RentDto> carrosRentado
) {
}
