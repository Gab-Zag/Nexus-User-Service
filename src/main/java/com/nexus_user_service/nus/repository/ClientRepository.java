package com.nexus_user_service.nus.repository;

import com.nexus_user_service.nus.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    Optional<Client> findByEmail(String email);
}
