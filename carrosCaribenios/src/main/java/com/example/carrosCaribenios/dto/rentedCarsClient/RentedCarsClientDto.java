package com.example.carrosCaribenios.dto.rentedCarsClient;

import com.example.carrosCaribenios.dto.client.ClientDto;
import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.entitys.Client;
import lombok.Builder;

import java.util.List;
import java.util.Set;

@Builder
public record RentedCarsClientDto(
        Long id,
        ClientDto cliente,
        List<RentDto> carrosRentado
) {
}
