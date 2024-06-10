package com.example.carrosCaribenios.service.rent;

import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.dto.rent.RentMapper;
import com.example.carrosCaribenios.dto.rent.RentToSaveDto;
import com.example.carrosCaribenios.entitys.Rent;
import com.example.carrosCaribenios.exception.RentNotFoundException;
import com.example.carrosCaribenios.repository.RentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentServiceImpl implements RentService{

    private final RentRepository rentRepository;
    @Override
    public RentDto guardarCarro(RentToSaveDto rentDto) {
        Rent rent = RentMapper.INSTANCE.rentToSaveDtoToRent(rentDto);
        Rent rentSave = rentRepository.save(rent);
        return RentMapper.INSTANCE.rentToRentDto(rentSave);
    }

    @Override
    public RentDto actualizarCarro(Long id, RentToSaveDto rentDto) {
        return rentRepository.findById(id).map(rentInBd -> {
            rentInBd.setCiudad(rentDto.ciudad());
            rentInBd.setFechaInicio(rentDto.fechaInicio());
            rentInBd.setFechaFinal(rentDto.fechaFinal());
            rentInBd.setModelo(rentDto.modelo());
            rentInBd.setMarca(rentDto.marca());
            rentInBd.setPrecio(rentDto.precio());

            Rent rentSave = rentRepository.save(rentInBd);

            return RentMapper.INSTANCE.rentToRentDto(rentSave);
        }).orElseThrow(() -> new RentNotFoundException("Carro no encontrado"));
    }

    @Override
    public RentDto buscarCarroPorId(Long id) throws RentNotFoundException {
        Rent rent = rentRepository.findById(id)
                .orElseThrow(() -> new RentNotFoundException("Carro No Encontrado"));
        return RentMapper.INSTANCE.rentToRentDto(rent);
    }

    @Override
    public void removerCarro(Long id) {
        Rent rent = rentRepository.findById(id)
                .orElseThrow(() -> new RentNotFoundException("No se encontró el coche a eliminar"));
        rentRepository.delete(rent);
    }

    @Override
    public List<RentDto> gerAllCarros() {
        List<Rent> rents = rentRepository.findAll();
        return RentMapper.INSTANCE.rentsToRentsDto(rents);
    }

    @Override
    public List<RentDto> filtrarPorCiudadYFechas(String ciudad, LocalDateTime fechaInicio, LocalDateTime fechaFinal) throws RentNotFoundException {
        List<Rent> rents = rentRepository.findCarsFilters(ciudad,fechaInicio,fechaFinal);
        if(rents.isEmpty()) {
            throw new RentNotFoundException("No se encontró coches En renta con esas condiciones");
        }
        return RentMapper.INSTANCE.rentsToRentsDto(rents);
    }
}
