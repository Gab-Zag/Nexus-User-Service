package com.nexus_user_service.nus.service;

import com.nexus_user_service.nus.dto.LoginRequest;
import com.nexus_user_service.nus.entity.Client;
import com.nexus_user_service.nus.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public Client Register(Client client){
        return clientRepository.save(client);
    }

    public String login(LoginRequest data){
        Client client = clientRepository.findByEmail(data.email()).orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));
        if(!data.password().equals(client.getPassword())){
            throw new RuntimeException("Senha invalida");
        }
        return "Login realizado com sucesso";
    }
}
