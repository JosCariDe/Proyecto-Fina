package com.example.carrosCaribenios.dto.client;

import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import lombok.Builder;
import lombok.Data;

@Builder
public record ClientDto(
        Long id,
        String nombre,
        String apellido,
        Integer cedula,
        String correo,
        Integer numeroCelular,
        ClientDto cliente,
        RentedCarsClientDto carrosRentados

) {
}
