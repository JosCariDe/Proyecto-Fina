package com.example.carrosCaribenios.dto.client;

import com.example.carrosCaribenios.dto.clientData.ClientDataDto;
import com.example.carrosCaribenios.dto.clientData.ClientDataToSaveDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientToSaveDto;
import lombok.Builder;
import lombok.Data;

@Builder
public record ClientToSaveDto(
        Long id,
        ClientDataToSaveDto datosCliente
) {
}
