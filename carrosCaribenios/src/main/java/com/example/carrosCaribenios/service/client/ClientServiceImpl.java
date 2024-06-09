package com.example.carrosCaribenios.service.client;

import com.example.carrosCaribenios.dto.client.ClientDto;
import com.example.carrosCaribenios.dto.client.ClientToSaveDto;
import com.example.carrosCaribenios.exception.ClientNotFoundException;

import java.util.List;

public class ClientServiceImpl implements ClientService{
    @Override
    public ClientDto guardarCliente(ClientToSaveDto clientDto) {
        return null;
    }

    @Override
    public ClientDto actualizarCliente(Long id, ClientToSaveDto clientDto) {
        return null;
    }

    @Override
    public ClientDto buscarClientePorId(Long id) throws ClientNotFoundException {
        return null;
    }

    @Override
    public void removerCliente(Long id) {

    }

    @Override
    public List<ClientDto> getAllClientes() {
        return null;
    }
}
