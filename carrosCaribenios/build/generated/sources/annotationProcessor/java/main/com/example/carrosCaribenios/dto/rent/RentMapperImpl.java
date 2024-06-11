package com.example.carrosCaribenios.dto.rent;

import com.example.carrosCaribenios.entitys.Rent;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T14:58:16-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Amazon.com Inc.)"
)
public class RentMapperImpl implements RentMapper {

    @Override
    public Rent rentDtoToRent(RentDto rentDto) {
        if ( rentDto == null ) {
            return null;
        }

        Rent.RentBuilder rent = Rent.builder();

        rent.id( rentDto.id() );
        rent.modelo( rentDto.modelo() );
        rent.marca( rentDto.marca() );
        rent.ciudad( rentDto.ciudad() );
        rent.fechaInicio( rentDto.fechaInicio() );
        rent.fechaFinal( rentDto.fechaFinal() );
        rent.precio( rentDto.precio() );
        rent.rentadoCliente( rentDto.rentadoCliente() );

        return rent.build();
    }

    @Override
    public Rent rentToSaveDtoToRent(RentToSaveDto rentToSaveDto) {
        if ( rentToSaveDto == null ) {
            return null;
        }

        Rent.RentBuilder rent = Rent.builder();

        rent.id( rentToSaveDto.id() );
        rent.modelo( rentToSaveDto.modelo() );
        rent.marca( rentToSaveDto.marca() );
        rent.ciudad( rentToSaveDto.ciudad() );
        rent.fechaInicio( rentToSaveDto.fechaInicio() );
        rent.fechaFinal( rentToSaveDto.fechaFinal() );
        rent.precio( rentToSaveDto.precio() );

        return rent.build();
    }

    @Override
    public RentDto rentToRentDto(Rent rent) {
        if ( rent == null ) {
            return null;
        }

        RentDto.RentDtoBuilder rentDto = RentDto.builder();

        rentDto.id( rent.getId() );
        rentDto.ciudad( rent.getCiudad() );
        rentDto.modelo( rent.getModelo() );
        rentDto.marca( rent.getMarca() );
        rentDto.fechaInicio( rent.getFechaInicio() );
        rentDto.fechaFinal( rent.getFechaFinal() );
        rentDto.precio( rent.getPrecio() );
        rentDto.rentadoCliente( rent.getRentadoCliente() );

        return rentDto.build();
    }

    @Override
    public List<Rent> rentsDtoToRents(List<RentDto> rentDtoList) {
        if ( rentDtoList == null ) {
            return null;
        }

        List<Rent> list = new ArrayList<Rent>( rentDtoList.size() );
        for ( RentDto rentDto : rentDtoList ) {
            list.add( rentDtoToRent( rentDto ) );
        }

        return list;
    }

    @Override
    public List<Rent> rentToSaveDtoToRents(List<RentToSaveDto> rentToSaveDtoList) {
        if ( rentToSaveDtoList == null ) {
            return null;
        }

        List<Rent> list = new ArrayList<Rent>( rentToSaveDtoList.size() );
        for ( RentToSaveDto rentToSaveDto : rentToSaveDtoList ) {
            list.add( rentToSaveDtoToRent( rentToSaveDto ) );
        }

        return list;
    }

    @Override
    public List<RentDto> rentsToRentsDto(List<Rent> rentList) {
        if ( rentList == null ) {
            return null;
        }

        List<RentDto> list = new ArrayList<RentDto>( rentList.size() );
        for ( Rent rent : rentList ) {
            list.add( rentToRentDto( rent ) );
        }

        return list;
    }
}
