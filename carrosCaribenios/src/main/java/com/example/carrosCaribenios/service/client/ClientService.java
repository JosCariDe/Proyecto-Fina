package com.example.carrosCaribenios.service.client;

import com.example.carrosCaribenios.dto.client.ClientDto;
import com.example.carrosCaribenios.dto.client.ClientToSaveDto;
import com.example.carrosCaribenios.exception.ClientNotFoundException;

import java.util.List;

public interface ClientService {
    ClientDto guardarCliente(ClientToSaveDto clientDto);
    ClientDto actualizarCliente(Long id, ClientToSaveDto clientDto);
    ClientDto buscarClientePorId(Long id) throws ClientNotFoundException;
    void removerCliente(Long id);
    List<ClientDto> getAllClientes();

}
