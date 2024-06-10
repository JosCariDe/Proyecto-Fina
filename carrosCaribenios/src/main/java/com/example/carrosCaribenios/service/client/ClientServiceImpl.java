package com.example.carrosCaribenios.service.client;

import com.example.carrosCaribenios.dto.client.ClientDto;
import com.example.carrosCaribenios.dto.client.ClientMapper;
import com.example.carrosCaribenios.dto.client.ClientToSaveDto;
import com.example.carrosCaribenios.entitys.Client;
import com.example.carrosCaribenios.exception.ClientNotFoundException;
import com.example.carrosCaribenios.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;
    @Override
    public ClientDto guardarCliente(ClientToSaveDto clientDto) {
        Client client = ClientMapper.INSTANCE.clientToSaveDtoToClient(clientDto);
        Client clientSave = clientRepository.save(client);
        return ClientMapper.INSTANCE.clientToClientDto(clientSave);
    }

    @Override
    public ClientDto actualizarCliente(Long id, ClientToSaveDto clientDto) {
        return clientRepository.findById(id).map(clienteInDb -> {
            clienteInDb.setCedula(clientDto.cedula());
            clienteInDb.setNombre(clientDto.nombre());
            clienteInDb.setApellido(clientDto.apellido());
            clienteInDb.setCorreo(clientDto.correo());
            clienteInDb.setNumeroCelular(clientDto.numeroCelular());
            Client clientSave = clientRepository.save(clienteInDb);

            return ClientMapper.INSTANCE.clientToClientDto(clienteInDb);
        }).orElseThrow(() -> new ClientNotFoundException("Cliente No Encontrado"));
    }

    @Override
    public ClientDto buscarClientePorId(Long id) throws ClientNotFoundException {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException("Cliente No Encontrado"));
        return ClientMapper.INSTANCE.clientToClientDto(client);
    }

    @Override
    public void removerCliente(Long id) {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new ClientNotFoundException("Cliente No Encontrado"));
        clientRepository.delete(client);
    }

    @Override
    public List<ClientDto> getAllClientes() {
        List<Client> clients = clientRepository.findAll();
        return ClientMapper.INSTANCE.clientsToClientsDto(clients);
    }
}
