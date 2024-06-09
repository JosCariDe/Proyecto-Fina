package com.example.carrosCaribenios.dto.clientData;

import com.example.carrosCaribenios.dto.client.ClientDto;
import com.example.carrosCaribenios.entitys.Client;
import com.example.carrosCaribenios.entitys.ClientData;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientDataMapper {

    ClientDataMapper INSTANCE = Mappers.getMapper(ClientDataMapper.class);

    ClientData clientDtoToClient(ClientDataDto clientDataDto);

    @Mapping(target = "datosCliente", ignore = true)
    @Mapping(target = "carrosRentados", ignore = true)
    Client clientToSaveDtoToClient(ClientDataToSaveDto clientDataToSaveDto);

    ClientDataDto clientDataToClientDto(ClientData clientData);

    List<ClientData> clientsDataDtoToClientsData(List<ClientDataDto> clientDataDtos);

    List<ClientDataDto> clientsDataToClientsDataDto(List<ClientData> clientDataList);


}
