package com.example.carrosCaribenios.dto.client;

import com.example.carrosCaribenios.dto.clientData.ClientDataDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import lombok.Builder;
import lombok.Data;

@Builder
public record ClientDto(
        Long id,
        ClientDataDto datosCliente,
        RentedCarsClientDto carrosRentados

) {
}
