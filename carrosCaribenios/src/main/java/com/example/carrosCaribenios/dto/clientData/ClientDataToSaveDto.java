package com.example.carrosCaribenios.dto.clientData;

import com.example.carrosCaribenios.dto.client.ClientDto;
import lombok.Builder;
import lombok.Data;

@Builder
public record ClientDataToSaveDto(
        Long id,
        String nombre,
        String apellido,
        Integer cedula,
        String correo,
        Integer numeroCelular
) {
}
