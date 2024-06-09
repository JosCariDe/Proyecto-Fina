package com.example.carrosCaribenios.service.rentedCarsClient;

import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientToSaveDto;
import com.example.carrosCaribenios.exception.RentedCarsClientNotFoundException;

import java.util.List;

public interface RentedCarsClientService {
    RentedCarsClientDto guardarCarroRentadoCliente(RentedCarsClientToSaveDto rentedCarsClientDto);
    RentedCarsClientDto actualizarCarroRentadoCliente(Long id, RentedCarsClientToSaveDto rentedCarsClientDto );
    RentedCarsClientDto buscarCarroRentadoCliente(Long id) throws RentedCarsClientNotFoundException;
    void removerCarroRentadoCliente(Long id);
    List<RentedCarsClientDto> getAll();
    List<RentDto> obtenerTodosLosCarrosRentadosPorCliente(Long idCliente) throws RentedCarsClientNotFoundException;
}
