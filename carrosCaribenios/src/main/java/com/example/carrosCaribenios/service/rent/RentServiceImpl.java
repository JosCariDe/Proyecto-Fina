package com.example.carrosCaribenios.service.rent;

import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.dto.rent.RentToSaveDto;
import com.example.carrosCaribenios.exception.RentNotFoundException;

import java.time.LocalDateTime;
import java.util.List;

public class RentServiceImpl implements RentService{
    @Override
    public RentDto guardarCarro(RentToSaveDto rentDto) {
        return null;
    }

    @Override
    public RentDto actualizarCarro(Long id, RentToSaveDto rentDto) {
        return null;
    }

    @Override
    public RentDto buscarCarroPorId(Long id) throws RentNotFoundException {
        return null;
    }

    @Override
    public void removerCarro(Long id) {

    }

    @Override
    public List<RentDto> gerAllCarros() {
        return null;
    }

    @Override
    public List<RentDto> filtrarPorCiudadYFechas(String ciudad, LocalDateTime fechaInicio, LocalDateTime fechaFinal) throws RentNotFoundException {
        return null;
    }
}
