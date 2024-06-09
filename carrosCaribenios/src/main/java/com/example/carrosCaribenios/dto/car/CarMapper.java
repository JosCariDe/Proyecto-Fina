package com.example.carrosCaribenios.dto.car;

import com.example.carrosCaribenios.entitys.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    Car carDtoToCar(CarDto carDto);

    @Mapping(target = "rentar", ignore = true)
    Car carToSaveDtoToCar(CarToSaveDto carToSaveDto);

    CarDto carToCarDto(Car car);

    List<Car> carsDtoToCars(List<CarDto> carDtoList);

    List<CarDto> carsToCarsDto(List<Car> carList);


}
