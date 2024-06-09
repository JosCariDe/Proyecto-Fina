package com.example.carrosCaribenios.dto.client;

import com.example.carrosCaribenios.entitys.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    Client clientDtoToClient(ClientDto clientDto);

    Client clientToSaveDtoToClient(ClientToSaveDto clientToSaveDto);

    ClientDto clientToClientDto(ClientDto clientDto);

    List<Client> clientsDtoToClients(List<ClientDto> clientDtoList);

    List<ClientDto> clientsToClientsDto(List<Client> clientList);
}
