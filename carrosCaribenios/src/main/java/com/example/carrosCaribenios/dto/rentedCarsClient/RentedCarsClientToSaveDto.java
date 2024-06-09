package com.example.carrosCaribenios.dto.rentedCarsClient;

import com.example.carrosCaribenios.dto.client.ClientDto;
import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.dto.rent.RentToSaveDto;
import lombok.Builder;

import java.util.List;

@Builder
public record RentedCarsClientToSaveDto(
        Long id,
        ClientDto cliente,
        List<RentToSaveDto> carrosRentado
) {
}
