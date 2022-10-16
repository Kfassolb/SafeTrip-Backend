package com.example.safetripbackend.serviceinterfaces;

import com.example.safetripbackend.entities.Destino;

import java.util.List;

public interface IDestinoService {
    public void insert(Destino destino);

    List<Destino> list();
}
