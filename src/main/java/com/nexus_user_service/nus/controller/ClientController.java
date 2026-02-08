package com.nexus_user_service.nus.controller;

import com.nexus_user_service.nus.dto.LoginRequest;
import com.nexus_user_service.nus.entity.Client;
import com.nexus_user_service.nus.service.ClientService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid Client client){
        this.clientService.Register(client);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid LoginRequest data){
        String login = this.clientService.login(data);
        return ResponseEntity.ok(login);
    }
}
