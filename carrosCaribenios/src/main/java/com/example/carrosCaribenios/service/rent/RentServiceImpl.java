package com.example.carrosCaribenios.service.rent;

import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.dto.rent.RentMapper;
import com.example.carrosCaribenios.dto.rent.RentToSaveDto;
import com.example.carrosCaribenios.entitys.Rent;
import com.example.carrosCaribenios.exception.RentNotFoundException;
import com.example.carrosCaribenios.repository.RentRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentServiceImpl implements RentService{

    private final RentRepository rentRepository;

    @PostConstruct
    public void init() {
        // Crear 10 coches rentados
        Rent rent1 = Rent.builder()
                .precio(50.0F)
                .fechaInicio(LocalDateTime.parse("2024-01-01T08:00:00"))
                .fechaFinal(LocalDateTime.parse("2024-01-07T08:00:00"))
                .ciudad("Ciudad1")
                .marca("Toyota")
                .modelo("Corolla")
                .build();
        Rent rent2 = Rent.builder()
                .precio(60.0F)
                .fechaInicio(LocalDateTime.parse("2024-01-02T08:00:00"))
                .fechaFinal(LocalDateTime.parse("2024-01-08T08:00:00"))
                .ciudad("Ciudad2")
                .marca("Honda")
                .modelo("Civic")
                .build();
        // Similar para los otros coches...

        rentRepository.saveAll(Arrays.asList(rent1, rent2 /* , rent3, rent4, ..., rent10 */));
    }
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
