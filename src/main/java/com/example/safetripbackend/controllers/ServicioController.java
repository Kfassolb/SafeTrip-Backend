package com.example.safetripbackend.controllers;

import com.example.safetripbackend.entities.Servicio;
import com.example.safetripbackend.serviceinterfaces.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicios")
public class ServicioController {
    @Autowired
    private IServicioService svService;
    @PostMapping
    public void registrar(@RequestBody Servicio d){
        svService.insert(d);
    }
    @GetMapping
    public List<Servicio> listar(){
        return svService.list();
    }
}
