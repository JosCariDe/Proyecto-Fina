package com.example.carrosCaribenios.dto.rent;

import com.example.carrosCaribenios.dto.client.ClientDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import com.example.carrosCaribenios.entitys.Client;
import com.example.carrosCaribenios.entitys.Rent;
import com.example.carrosCaribenios.entitys.RentedCarsClient;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T12:50:03-0500",
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
        rent.rentadoCliente( rentedCarsClientDtoToRentedCarsClient( rentDto.rentadoCliente() ) );

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
        rentDto.rentadoCliente( rentedCarsClientToRentedCarsClientDto( rent.getRentadoCliente() ) );

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

    protected Client clientDtoToClient(ClientDto clientDto) {
        if ( clientDto == null ) {
            return null;
        }

        Client.ClientBuilder client = Client.builder();

        client.id( clientDto.id() );
        client.carrosRentados( rentedCarsClientDtoToRentedCarsClient( clientDto.carrosRentados() ) );
        client.nombre( clientDto.nombre() );
        client.apellido( clientDto.apellido() );
        client.cedula( clientDto.cedula() );
        client.correo( clientDto.correo() );
        client.numeroCelular( clientDto.numeroCelular() );

        return client.build();
    }

    protected RentedCarsClient rentedCarsClientDtoToRentedCarsClient(RentedCarsClientDto rentedCarsClientDto) {
        if ( rentedCarsClientDto == null ) {
            return null;
        }

        RentedCarsClient.RentedCarsClientBuilder rentedCarsClient = RentedCarsClient.builder();

        rentedCarsClient.id( rentedCarsClientDto.id() );
        rentedCarsClient.cliente( clientDtoToClient( rentedCarsClientDto.cliente() ) );
        rentedCarsClient.carrosRentado( rentsDtoToRents( rentedCarsClientDto.carrosRentado() ) );

        return rentedCarsClient.build();
    }

    protected ClientDto clientToClientDto(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientDto.ClientDtoBuilder clientDto = ClientDto.builder();

        clientDto.id( client.getId() );
        clientDto.nombre( client.getNombre() );
        clientDto.apellido( client.getApellido() );
        clientDto.cedula( client.getCedula() );
        clientDto.correo( client.getCorreo() );
        clientDto.numeroCelular( client.getNumeroCelular() );
        clientDto.carrosRentados( rentedCarsClientToRentedCarsClientDto( client.getCarrosRentados() ) );

        return clientDto.build();
    }

    protected RentedCarsClientDto rentedCarsClientToRentedCarsClientDto(RentedCarsClient rentedCarsClient) {
        if ( rentedCarsClient == null ) {
            return null;
        }

        RentedCarsClientDto.RentedCarsClientDtoBuilder rentedCarsClientDto = RentedCarsClientDto.builder();

        rentedCarsClientDto.id( rentedCarsClient.getId() );
        rentedCarsClientDto.cliente( clientToClientDto( rentedCarsClient.getCliente() ) );
        rentedCarsClientDto.carrosRentado( rentsToRentsDto( rentedCarsClient.getCarrosRentado() ) );

        return rentedCarsClientDto.build();
    }
}
