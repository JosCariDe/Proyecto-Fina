package com.example.carrosCaribenios.dto.rentedCarsClient;

import com.example.carrosCaribenios.entitys.RentedCarsClient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RentedCarsClientMapper {

    RentedCarsClientMapper INSTANCE = Mappers.getMapper(RentedCarsClientMapper.class);

    RentedCarsClient toRentedCarsClient(RentedCarsClientToSaveDto rentedCarsClientToSaveDto);
    RentedCarsClient toRentedCarsClient(RentedCarsClientDto rentedCarsClientDTO);

    RentedCarsClientDto toRentedCarsClientDTO(RentedCarsClient rentedCarsClient);

    List<RentedCarsClientDto> toRentedsCarsClientDTO(List<RentedCarsClient> rentedCarsClientList);

    List<RentedCarsClient> toRentedsCarsClient(List<RentedCarsClientDto> rentedCarsClientDtoList);

}
