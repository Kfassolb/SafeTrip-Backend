package com.example.safetripbackend.serviceinterfaces;

import com.example.safetripbackend.entities.Destino;
import com.example.safetripbackend.entities.Grupo;

import java.util.List;

public interface IGrupoService {
    public void insert(Grupo grupo);

    List<Grupo> list();

    public void delete(int idGrupo);

    List<Grupo> search(String nombreGrupo);
}
