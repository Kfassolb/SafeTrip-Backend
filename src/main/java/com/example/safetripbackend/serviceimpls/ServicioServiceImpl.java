package com.example.safetripbackend.serviceimpls;

import com.example.safetripbackend.entities.Servicio;
import com.example.safetripbackend.repositories.IServicioRepository;
import com.example.safetripbackend.serviceinterfaces.IServicioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServiceImpl implements IServicioService {
    private IServicioRepository sR;

    @Override
    public void insert(Servicio servicio) {
        sR.save(servicio);
    }

    @Override
    public List<Servicio> list() {
        return sR.findAll();
    }
}
