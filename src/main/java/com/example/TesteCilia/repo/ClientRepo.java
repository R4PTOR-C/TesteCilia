package com.example.TesteCilia.repo;


import com.example.TesteCilia.models.Client;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

import java.util.Optional;

public interface ClientRepo extends JpaRepository <Client, Long>{
    void deleteClientById(Long id);

    Optional<Client> findClientById(Long id);
}
