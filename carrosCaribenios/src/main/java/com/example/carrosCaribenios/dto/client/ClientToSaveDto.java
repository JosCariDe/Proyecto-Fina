package com.example.carrosCaribenios.dto.client;

import com.example.carrosCaribenios.dto.clientData.ClientDataDto;
import com.example.carrosCaribenios.dto.clientData.ClientDataToSaveDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientToSaveDto;
import lombok.Data;

@Data
public record ClientToSaveDto(
        Long id,
        ClientDataToSaveDto datosCliente,
        RentedCarsClientToSaveDto carrosRentados
) {
}
