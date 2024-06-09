package com.example.carrosCaribenios.dto.rentedCarsClient;

import com.example.carrosCaribenios.dto.client.ClientDto;
import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.dto.rent.RentToSaveDto;
import com.example.carrosCaribenios.entitys.Client;
import com.example.carrosCaribenios.entitys.Rent;
import com.example.carrosCaribenios.entitys.RentedCarsClient;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-09T17:53:09-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Amazon.com Inc.)"
)
public class RentedCarsClientMapperImpl implements RentedCarsClientMapper {

    @Override
    public RentedCarsClient toRentedCarsClient(RentedCarsClientToSaveDto rentedCarsClientToSaveDto) {
        if ( rentedCarsClientToSaveDto == null ) {
            return null;
        }

        RentedCarsClient rentedCarsClient = new RentedCarsClient();

        rentedCarsClient.setId( rentedCarsClientToSaveDto.id() );
        rentedCarsClient.setCliente( clientDtoToClient( rentedCarsClientToSaveDto.cliente() ) );
        rentedCarsClient.setCarrosRentado( rentToSaveDtoListToRentList( rentedCarsClientToSaveDto.carrosRentado() ) );

        return rentedCarsClient;
    }

    @Override
    public RentedCarsClient toRentedCarsClient(RentedCarsClientDto rentedCarsClientDTO) {
        if ( rentedCarsClientDTO == null ) {
            return null;
        }

        RentedCarsClient rentedCarsClient = new RentedCarsClient();

        rentedCarsClient.setId( rentedCarsClientDTO.id() );
        rentedCarsClient.setCliente( clientDtoToClient( rentedCarsClientDTO.cliente() ) );
        rentedCarsClient.setCarrosRentado( rentDtoListToRentList( rentedCarsClientDTO.carrosRentado() ) );

        return rentedCarsClient;
    }

    @Override
    public RentedCarsClientDto toRentedCarsClientDTO(RentedCarsClient rentedCarsClient) {
        if ( rentedCarsClient == null ) {
            return null;
        }

        RentedCarsClientDto.RentedCarsClientDtoBuilder rentedCarsClientDto = RentedCarsClientDto.builder();

        rentedCarsClientDto.id( rentedCarsClient.getId() );
        rentedCarsClientDto.cliente( clientToClientDto( rentedCarsClient.getCliente() ) );
        rentedCarsClientDto.carrosRentado( rentListToRentDtoList( rentedCarsClient.getCarrosRentado() ) );

        return rentedCarsClientDto.build();
    }

    @Override
    public List<RentedCarsClientDto> toRentedsCarsClientDTO(List<RentedCarsClient> rentedCarsClientList) {
        if ( rentedCarsClientList == null ) {
            return null;
        }

        List<RentedCarsClientDto> list = new ArrayList<RentedCarsClientDto>( rentedCarsClientList.size() );
        for ( RentedCarsClient rentedCarsClient : rentedCarsClientList ) {
            list.add( toRentedCarsClientDTO( rentedCarsClient ) );
        }

        return list;
    }

    @Override
    public List<RentedCarsClient> toRentedsCarsClient(List<RentedCarsClientDto> rentedCarsClientDtoList) {
        if ( rentedCarsClientDtoList == null ) {
            return null;
        }

        List<RentedCarsClient> list = new ArrayList<RentedCarsClient>( rentedCarsClientDtoList.size() );
        for ( RentedCarsClientDto rentedCarsClientDto : rentedCarsClientDtoList ) {
            list.add( toRentedCarsClient( rentedCarsClientDto ) );
        }

        return list;
    }

    protected Client clientDtoToClient(ClientDto clientDto) {
        if ( clientDto == null ) {
            return null;
        }

        Client client = new Client();

        client.setId( clientDto.id() );
        client.setCarrosRentados( toRentedCarsClient( clientDto.carrosRentados() ) );
        client.setNombre( clientDto.nombre() );
        client.setApellido( clientDto.apellido() );
        client.setCedula( clientDto.cedula() );
        client.setCorreo( clientDto.correo() );
        client.setNumeroCelular( clientDto.numeroCelular() );

        return client;
    }

    protected Rent rentToSaveDtoToRent(RentToSaveDto rentToSaveDto) {
        if ( rentToSaveDto == null ) {
            return null;
        }

        Rent rent = new Rent();

        rent.setId( rentToSaveDto.id() );
        rent.setModelo( rentToSaveDto.modelo() );
        rent.setMarca( rentToSaveDto.marca() );
        rent.setCiudad( rentToSaveDto.ciudad() );
        rent.setFechaInicio( rentToSaveDto.fechaInicio() );
        rent.setFechaFinal( rentToSaveDto.fechaFinal() );
        rent.setPrecio( rentToSaveDto.precio() );

        return rent;
    }

    protected List<Rent> rentToSaveDtoListToRentList(List<RentToSaveDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Rent> list1 = new ArrayList<Rent>( list.size() );
        for ( RentToSaveDto rentToSaveDto : list ) {
            list1.add( rentToSaveDtoToRent( rentToSaveDto ) );
        }

        return list1;
    }

    protected Rent rentDtoToRent(RentDto rentDto) {
        if ( rentDto == null ) {
            return null;
        }

        Rent rent = new Rent();

        rent.setId( rentDto.id() );
        rent.setModelo( rentDto.modelo() );
        rent.setMarca( rentDto.marca() );
        rent.setCiudad( rentDto.ciudad() );
        rent.setFechaInicio( rentDto.fechaInicio() );
        rent.setFechaFinal( rentDto.fechaFinal() );
        rent.setPrecio( rentDto.precio() );
        rent.setRentadoCliente( toRentedCarsClient( rentDto.rentadoCliente() ) );

        return rent;
    }

    protected List<Rent> rentDtoListToRentList(List<RentDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Rent> list1 = new ArrayList<Rent>( list.size() );
        for ( RentDto rentDto : list ) {
            list1.add( rentDtoToRent( rentDto ) );
        }

        return list1;
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
        clientDto.carrosRentados( toRentedCarsClientDTO( client.getCarrosRentados() ) );

        return clientDto.build();
    }

    protected RentDto rentToRentDto(Rent rent) {
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
        rentDto.rentadoCliente( toRentedCarsClientDTO( rent.getRentadoCliente() ) );

        return rentDto.build();
    }

    protected List<RentDto> rentListToRentDtoList(List<Rent> list) {
        if ( list == null ) {
            return null;
        }

        List<RentDto> list1 = new ArrayList<RentDto>( list.size() );
        for ( Rent rent : list ) {
            list1.add( rentToRentDto( rent ) );
        }

        return list1;
    }
}
