package com.example.carrosCaribenios.dto.rent;

import com.example.carrosCaribenios.dto.client.ClientDto;
import com.example.carrosCaribenios.dto.clientData.ClientDataDto;
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
public class RentMapperImpl implements RentMapper {

    @Override
    public Rent rentDtoToRent(RentDto rentDto) {
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

    @Override
    public Rent rentToSaveDtoToRent(RentToSaveDto rentToSaveDto) {
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

    protected ClientData clientDataDtoToClientData(ClientDataDto clientDataDto) {
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
        clientData.setCliente( clientDtoToClient( clientDataDto.cliente() ) );

        return clientData;
    }

    protected Client clientDtoToClient(ClientDto clientDto) {
        if ( clientDto == null ) {
            return null;
        }

        Client client = new Client();

        client.setId( clientDto.id() );
        client.setDatosCliente( clientDataDtoToClientData( clientDto.datosCliente() ) );
        client.setCarrosRentados( rentedCarsClientDtoToRentedCarsClient( clientDto.carrosRentados() ) );

        return client;
    }

    protected RentedCarsClient rentedCarsClientDtoToRentedCarsClient(RentedCarsClientDto rentedCarsClientDto) {
        if ( rentedCarsClientDto == null ) {
            return null;
        }

        RentedCarsClient rentedCarsClient = new RentedCarsClient();

        rentedCarsClient.setId( rentedCarsClientDto.id() );
        rentedCarsClient.setCliente( clientDtoToClient( rentedCarsClientDto.cliente() ) );
        rentedCarsClient.setCarrosRentado( rentsDtoToRents( rentedCarsClientDto.carrosRentado() ) );

        return rentedCarsClient;
    }

    protected ClientDataDto clientDataToClientDataDto(ClientData clientData) {
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

    protected ClientDto clientToClientDto(Client client) {
        if ( client == null ) {
            return null;
        }

        ClientDto.ClientDtoBuilder clientDto = ClientDto.builder();

        clientDto.id( client.getId() );
        clientDto.datosCliente( clientDataToClientDataDto( client.getDatosCliente() ) );
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
