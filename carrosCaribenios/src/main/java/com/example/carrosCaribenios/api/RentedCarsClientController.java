package com.example.carrosCaribenios.api;

import com.example.carrosCaribenios.dto.rent.RentDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientDto;
import com.example.carrosCaribenios.dto.rentedCarsClient.RentedCarsClientToSaveDto;
import com.example.carrosCaribenios.exception.RentedCarsClientNotFoundException;
import com.example.carrosCaribenios.service.rentedCarsClient.RentedCarsClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
//http://localhost:8080/api/v1/rented-cars-client
@RequestMapping("api/v1/rented-cars-client")
@CrossOrigin(value = "http://localhost:5173")
public class RentedCarsClientController {

    @Autowired
    private RentedCarsClientService rentedCarsClientService;

    @PostMapping
    public ResponseEntity<RentedCarsClientDto> guardarCarroRentadoCliente(@RequestBody RentedCarsClientToSaveDto rentedCarsClientDto) {
        try {
            RentedCarsClientDto savedRentedCarsClient = rentedCarsClientService.guardarCarroRentadoCliente(rentedCarsClientDto);
            URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(savedRentedCarsClient.id())
                    .toUri();
            return ResponseEntity.created(location).body(savedRentedCarsClient);
        } catch (RentedCarsClientNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<RentedCarsClientDto> actualizarCarroRentadoCliente(@PathVariable Long id, @RequestBody RentedCarsClientToSaveDto rentedCarsClientDto) {
        try {
            RentedCarsClientDto updatedRentedCarsClient = rentedCarsClientService.actualizarCarroRentadoCliente(id, rentedCarsClientDto);
            return new ResponseEntity<>(updatedRentedCarsClient, HttpStatus.OK);
        } catch (RentedCarsClientNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<RentedCarsClientDto> buscarCarroRentadoCliente(@PathVariable Long id) {
        try {
            RentedCarsClientDto rentedCarsClient = rentedCarsClientService.buscarCarroRentadoCliente(id);
            return new ResponseEntity<>(rentedCarsClient, HttpStatus.OK);
        } catch (RentedCarsClientNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerCarroRentadoCliente(@PathVariable Long id) {
        try {
            rentedCarsClientService.removerCarroRentadoCliente(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RentedCarsClientNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<RentedCarsClientDto>> getAll() {
        List<RentedCarsClientDto> rentedCarsClients = rentedCarsClientService.getAll();
        return new ResponseEntity<>(rentedCarsClients, HttpStatus.OK);
    }

    @GetMapping("/client/{idCliente}")
    public ResponseEntity<List<RentDto>> obtenerTodosLosCarrosRentadosPorCliente(@PathVariable Long idCliente) {
        try {
            List<RentDto> rentedCars = rentedCarsClientService.obtenerTodosLosCarrosRentadosPorCliente(idCliente);
            return new ResponseEntity<>(rentedCars, HttpStatus.OK);
        } catch (RentedCarsClientNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
