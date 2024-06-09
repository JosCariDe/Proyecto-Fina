package com.example.carrosCaribenios.dto.clientData;

import com.example.carrosCaribenios.dto.client.ClientDto;
import lombok.Data;

@Data
public record ClientDataDto(
        Long id,
        String nombre,
        String apellido,
        Integer cedula,
        String correo,
        Integer numeroCelular,
        ClientDto cliente
) {
}
