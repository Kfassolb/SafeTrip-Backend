package com.example.safetripbackend.repositories;

import com.example.safetripbackend.entities.Destino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDestinoRepository extends JpaRepository<Destino, Integer> {
}
