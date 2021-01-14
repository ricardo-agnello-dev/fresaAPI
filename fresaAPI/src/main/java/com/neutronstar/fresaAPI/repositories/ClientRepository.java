package com.neutronstar.fresaAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neutronstar.fresaAPI.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
