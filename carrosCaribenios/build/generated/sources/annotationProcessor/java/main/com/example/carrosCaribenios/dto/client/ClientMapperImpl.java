package com.example.carrosCaribenios.dto.client;

import com.example.carrosCaribenios.entitys.Client;
import com.example.carrosCaribenios.entitys.Rent;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-10T20:49:06-0500",
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
        List<Rent> list = clientDto.carrosRentados();
        if ( list != null ) {
            client.carrosRentados( new ArrayList<Rent>( list ) );
        }
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
        List<Rent> list = client.getCarrosRentados();
        if ( list != null ) {
            clientDto.carrosRentados( new ArrayList<Rent>( list ) );
        }
        clientDto.apellido( client.getApellido() );
        clientDto.cedula( client.getCedula() );
        clientDto.correo( client.getCorreo() );
        clientDto.numeroCelular( client.getNumeroCelular() );

        return clientDto.build();
    }

    @Override
    public ClientDto clientToSaveDtoToClientDto(ClientToSaveDto clientToSaveDto) {
        if ( clientToSaveDto == null ) {
            return null;
        }

        ClientDto.ClientDtoBuilder clientDto = ClientDto.builder();

        clientDto.id( clientToSaveDto.id() );
        clientDto.nombre( clientToSaveDto.nombre() );
        clientDto.apellido( clientToSaveDto.apellido() );
        clientDto.cedula( clientToSaveDto.cedula() );
        clientDto.correo( clientToSaveDto.correo() );
        clientDto.numeroCelular( clientToSaveDto.numeroCelular() );

        return clientDto.build();
    }

    @Override
    public ClientToSaveDto clientToClienToSaveDto(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientToSaveDto.ClientToSaveDtoBuilder clientToSaveDto = ClientToSaveDto.builder();

        clientToSaveDto.id( client.getId() );
        clientToSaveDto.nombre( client.getNombre() );
        clientToSaveDto.apellido( client.getApellido() );
        clientToSaveDto.cedula( client.getCedula() );
        clientToSaveDto.correo( client.getCorreo() );
        clientToSaveDto.numeroCelular( client.getNumeroCelular() );

        return clientToSaveDto.build();
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
}
