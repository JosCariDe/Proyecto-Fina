package com.example.carrosCaribenios.dto.car;

import com.example.carrosCaribenios.dto.rent.RentDto;
import lombok.Data;

@Data
public record CarDto(
        Long id,
        String modelo,
        String marca,
        RentDto rentar

) {
}
