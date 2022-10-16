package com.example.safetripbackend.repositories;

import com.example.safetripbackend.entities.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Integer> {
}
