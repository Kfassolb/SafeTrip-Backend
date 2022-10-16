package com.example.safetripbackend.serviceinterfaces;

import com.example.safetripbackend.entities.Servicio;

import java.util.List;

public interface IServicioService {
    public void insert(Servicio servicio);

    List<Servicio> list();
}
