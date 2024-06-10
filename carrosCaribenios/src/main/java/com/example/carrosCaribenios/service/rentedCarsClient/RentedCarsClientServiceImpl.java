package com.example.carrosCaribenios.service.rentedCarsClient;

import com.example.carrosCaribenios.dto.client.ClientMapper;
import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.dto.rent.RentMapper;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientMapper;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientToSaveDto;
import com.example.carrosCaribenios.entitys.Rent;
import com.example.carrosCaribenios.entitys.RentedCarsClient;
import com.example.carrosCaribenios.exception.RentedCarsClientNotFoundException;
import com.example.carrosCaribenios.repository.RentedCarsClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentedCarsClientServiceImpl implements RentedCarsClientService{

    private final RentedCarsClientRepository rentedCarsClientRepository;
    @Override
    public RentedCarsClientDto guardarCarroRentadoCliente(RentedCarsClientToSaveDto rentedCarsClientDto) {
        RentedCarsClient rentedCarsClient = RentedCarsClientMapper.INSTANCE.toRentedCarsClient(rentedCarsClientDto);
        RentedCarsClient rentedCarsClientSave = rentedCarsClientRepository.save(rentedCarsClient);
        return RentedCarsClientMapper.INSTANCE.toRentedCarsClientDTO(rentedCarsClientSave);
    }

    @Override
    public RentedCarsClientDto actualizarCarroRentadoCliente(Long id, RentedCarsClientToSaveDto rentedCarsClientDto) {

        return rentedCarsClientRepository.findById(id).map(rentedCCInBd -> {
            rentedCCInBd.setCarrosRentado(RentMapper.INSTANCE.rentToSaveDtoToRents(rentedCarsClientDto.carrosRentado()));
            rentedCCInBd.setCliente(ClientMapper.INSTANCE.clientDtoToClient(rentedCarsClientDto.cliente()));

            RentedCarsClient rentedCarsClientSave = rentedCarsClientRepository.save(rentedCCInBd);

            return RentedCarsClientMapper.INSTANCE.toRentedCarsClientDTO(rentedCarsClientSave);
        }).orElseThrow(() -> new RentedCarsClientNotFoundException("No se encontró"));

    }

    @Override
    public RentedCarsClientDto buscarCarroRentadoCliente(Long id) throws RentedCarsClientNotFoundException {
        RentedCarsClient rentedCarsClient = rentedCarsClientRepository.findById(id)
                .orElseThrow(() -> new RentedCarsClientNotFoundException("No se encontró CC"));
        return RentedCarsClientMapper.INSTANCE.toRentedCarsClientDTO(rentedCarsClient);
    }

    @Override
    public void removerCarroRentadoCliente(Long id) {
        RentedCarsClient rentedCarsClient = rentedCarsClientRepository.findById(id)
                .orElseThrow(() -> new RentedCarsClientNotFoundException("No se encontró CC"));
        rentedCarsClientRepository.delete(rentedCarsClient);
    }

    @Override
    public List<RentedCarsClientDto> getAll() {
        List<RentedCarsClient> rentedCarsClients = rentedCarsClientRepository.findAll();
        return RentedCarsClientMapper.INSTANCE.toRentedsCarsClientDTO(rentedCarsClients);
    }

    @Override
    public List<RentDto> obtenerTodosLosCarrosRentadosPorCliente(Long idCliente) throws RentedCarsClientNotFoundException {
        List<Rent> rentList = rentedCarsClientRepository.findRentedCarsByClientId(idCliente);

        return RentMapper.INSTANCE.rentsToRentsDto(rentList);
    }
}
