package com.example.carrosCaribenios.dto.clientData;

import com.example.carrosCaribenios.dto.client.ClientDto;
import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import com.example.carrosCaribenios.entitys.Client;
import com.example.carrosCaribenios.entitys.ClientData;
import com.example.carrosCaribenios.entitys.Rent;
import com.example.carrosCaribenios.entitys.RentedCarsClient;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-09T17:31:10-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Amazon.com Inc.)"
)
public class ClientDataMapperImpl implements ClientDataMapper {

    @Override
    public ClientData clientDtoToClient(ClientDataDto clientDataDto) {
        if ( clientDataDto == null ) {
            return null;
        }

        ClientData clientData = new ClientData();

        clientData.setId( clientDataDto.id() );
        clientData.setNombre( clientDataDto.nombre() );
        clientData.setApellido( clientDataDto.apellido() );
        clientData.setCedula( clientDataDto.cedula() );
        clientData.setCorreo( clientDataDto.correo() );
        clientData.setNumeroCelular( clientDataDto.numeroCelular() );
        clientData.setCliente( clientDtoToClient1( clientDataDto.cliente() ) );

        return clientData;
    }

    @Override
    public Client clientToSaveDtoToClient(ClientDataToSaveDto clientDataToSaveDto) {
        if ( clientDataToSaveDto == null ) {
            return null;
        }

        Client client = new Client();

        client.setId( clientDataToSaveDto.id() );

        return client;
    }

    @Override
    public ClientDataDto clientDataToClientDto(ClientData clientData) {
        if ( clientData == null ) {
            return null;
        }

        ClientDataDto.ClientDataDtoBuilder clientDataDto = ClientDataDto.builder();

        clientDataDto.id( clientData.getId() );
        clientDataDto.nombre( clientData.getNombre() );
        clientDataDto.apellido( clientData.getApellido() );
        clientDataDto.cedula( clientData.getCedula() );
        clientDataDto.correo( clientData.getCorreo() );
        clientDataDto.numeroCelular( clientData.getNumeroCelular() );
        clientDataDto.cliente( clientToClientDto( clientData.getCliente() ) );

        return clientDataDto.build();
    }

    @Override
    public List<ClientData> clientsDataDtoToClientsData(List<ClientDataDto> clientDataDtos) {
        if ( clientDataDtos == null ) {
            return null;
        }

        List<ClientData> list = new ArrayList<ClientData>( clientDataDtos.size() );
        for ( ClientDataDto clientDataDto : clientDataDtos ) {
            list.add( clientDtoToClient( clientDataDto ) );
        }

        return list;
    }

    @Override
    public List<ClientDataDto> clientsDataToClientsDataDto(List<ClientData> clientDataList) {
        if ( clientDataList == null ) {
            return null;
        }

        List<ClientDataDto> list = new ArrayList<ClientDataDto>( clientDataList.size() );
        for ( ClientData clientData : clientDataList ) {
            list.add( clientDataToClientDto( clientData ) );
        }

        return list;
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
        rent.setRentadoCliente( rentedCarsClientDtoToRentedCarsClient( rentDto.rentadoCliente() ) );

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

    protected RentedCarsClient rentedCarsClientDtoToRentedCarsClient(RentedCarsClientDto rentedCarsClientDto) {
        if ( rentedCarsClientDto == null ) {
            return null;
        }

        RentedCarsClient rentedCarsClient = new RentedCarsClient();

        rentedCarsClient.setId( rentedCarsClientDto.id() );
        rentedCarsClient.setCliente( clientDtoToClient1( rentedCarsClientDto.cliente() ) );
        rentedCarsClient.setCarrosRentado( rentDtoListToRentList( rentedCarsClientDto.carrosRentado() ) );

        return rentedCarsClient;
    }

    protected Client clientDtoToClient1(ClientDto clientDto) {
        if ( clientDto == null ) {
            return null;
        }

        Client client = new Client();

        client.setId( clientDto.id() );
        client.setDatosCliente( clientDtoToClient( clientDto.datosCliente() ) );
        client.setCarrosRentados( rentedCarsClientDtoToRentedCarsClient( clientDto.carrosRentados() ) );

        return client;
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

    protected ClientDto clientToClientDto(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientDto.ClientDtoBuilder clientDto = ClientDto.builder();

        clientDto.id( client.getId() );
        clientDto.datosCliente( clientDataToClientDto( client.getDatosCliente() ) );
        clientDto.carrosRentados( rentedCarsClientToRentedCarsClientDto( client.getCarrosRentados() ) );

        return clientDto.build();
    }
}
