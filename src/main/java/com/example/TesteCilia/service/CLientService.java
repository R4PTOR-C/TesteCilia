package com.example.TesteCilia.service;


import com.example.TesteCilia.exception.UserNotFoundException;
import com.example.TesteCilia.models.Client;
import com.example.TesteCilia.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CLientService {
    private final ClientRepo clientRepo;

    @Autowired
    public CLientService(ClientRepo clientRepo) {

        this.clientRepo = clientRepo;
    }

    public Client addClient(Client client){
        client.setClientCode(UUID.randomUUID().toString());
        return clientRepo.save(client);
    }

    public List<Client> findAllClients(){
        return clientRepo.findAll();
    }

    public Client updateClient(Client client){
        return clientRepo.save(client);
    }

    public Client findClientById(Long id){
        return clientRepo.findClientById(id)
                .orElseThrow(()-> new UserNotFoundException("Usuario com id"+ id + "nao encontrado"));
    }

    public void deleteClient(Long id){
        clientRepo.deleteClientById(id);
    }
}
