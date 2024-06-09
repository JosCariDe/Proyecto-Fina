package com.example.carrosCaribenios.service.rentedCarsClient;

import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientToSaveDto;
import com.example.carrosCaribenios.exception.RentedCarsClientNotFoundException;

import java.util.List;

public class RentedCarsClientServiceImpl implements RentedCarsClientService{
    @Override
    public RentedCarsClientDto guardarCarroRentadoCliente(RentedCarsClientToSaveDto rentedCarsClientDto) {
        return null;
    }

    @Override
    public RentedCarsClientDto actualizarCarroRentadoCliente(Long id, RentedCarsClientToSaveDto rentedCarsClientDto) {
        return null;
    }

    @Override
    public RentedCarsClientDto buscarCarroRentadoCliente(Long id) throws RentedCarsClientNotFoundException {
        return null;
    }

    @Override
    public void removerCarroRentadoCliente(Long id) {

    }

    @Override
    public List<RentedCarsClientDto> getAll() {
        return null;
    }

    @Override
    public List<RentDto> obtenerTodosLosCarrosRentadosPorCliente(Long idCliente) throws RentedCarsClientNotFoundException {
        return null;
    }
}
