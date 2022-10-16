package com.example.safetripbackend.repositories;

import com.example.safetripbackend.entities.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGrupoRepository extends JpaRepository<Grupo, Integer> {
}
