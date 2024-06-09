package com.example.carrosCaribenios.dto.car;

import com.example.carrosCaribenios.dto.rent.RentDto;
import lombok.Data;

@Data
public record CarToSaveDto(
        Long id,
        String modelo,
        String marca
) {
}
