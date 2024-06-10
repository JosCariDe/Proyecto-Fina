package com.example.carrosCaribenios.dto.client;

import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import com.example.carrosCaribenios.entitys.Client;
import com.example.carrosCaribenios.entitys.Rent;
import com.example.carrosCaribenios.entitys.RentedCarsClient;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T12:50:04-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Amazon.com Inc.)"
)
public class ClientMapperImpl implements ClientMapper {

    @Override
    public Client clientDtoToClient(ClientDto clientDto) {
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

    @Override
    public Client clientToSaveDtoToClient(ClientToSaveDto clientToSaveDto) {
        if ( clientToSaveDto == null ) {
            return null;
        }

        Client.ClientBuilder client = Client.builder();

        client.id( clientToSaveDto.id() );
        client.nombre( clientToSaveDto.nombre() );
        client.apellido( clientToSaveDto.apellido() );
        client.cedula( clientToSaveDto.cedula() );
        client.correo( clientToSaveDto.correo() );
        client.numeroCelular( clientToSaveDto.numeroCelular() );

        return client.build();
    }

    @Override
    public ClientDto clientToClientDto(Client client) {
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

    @Override
    public List<Client> clientsDtoToClients(List<ClientDto> clientDtoList) {
        if ( clientDtoList == null ) {
            return null;
        }

        List<Client> list = new ArrayList<Client>( clientDtoList.size() );
        for ( ClientDto clientDto : clientDtoList ) {
            list.add( clientDtoToClient( clientDto ) );
        }

        return list;
    }

    @Override
    public List<ClientDto> clientsToClientsDto(List<Client> clientList) {
        if ( clientList == null ) {
            return null;
        }

        List<ClientDto> list = new ArrayList<ClientDto>( clientList.size() );
        for ( Client client : clientList ) {
            list.add( clientToClientDto( client ) );
        }

        return list;
    }

    protected Rent rentDtoToRent(RentDto rentDto) {
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

    protected RentedCarsClient rentedCarsClientDtoToRentedCarsClient(RentedCarsClientDto rentedCarsClientDto) {
        if ( rentedCarsClientDto == null ) {
            return null;
        }

        RentedCarsClient.RentedCarsClientBuilder rentedCarsClient = RentedCarsClient.builder();

        rentedCarsClient.id( rentedCarsClientDto.id() );
        rentedCarsClient.cliente( clientDtoToClient( rentedCarsClientDto.cliente() ) );
        rentedCarsClient.carrosRentado( rentDtoListToRentList( rentedCarsClientDto.carrosRentado() ) );

        return rentedCarsClient.build();
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
        rentDto.rentadoCliente( rentedCarsClientToRentedCarsClientDto( rent.getRentadoCliente() ) );

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

    protected RentedCarsClientDto rentedCarsClientToRentedCarsClientDto(RentedCarsClient rentedCarsClient) {
        if ( rentedCarsClient == null ) {
            return null;
        }

        RentedCarsClientDto.RentedCarsClientDtoBuilder rentedCarsClientDto = RentedCarsClientDto.builder();

        rentedCarsClientDto.id( rentedCarsClient.getId() );
        rentedCarsClientDto.cliente( clientToClientDto( rentedCarsClient.getCliente() ) );
        rentedCarsClientDto.carrosRentado( rentListToRentDtoList( rentedCarsClient.getCarrosRentado() ) );

        return rentedCarsClientDto.build();
    }
}
