package com.example.safetripbackend.controllers;

import com.example.safetripbackend.entities.Destino;
import com.example.safetripbackend.serviceinterfaces.IDestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {
    @Autowired
    private IDestinoService dService;
    @PostMapping
    public void registrar(@RequestBody Destino d){
    dService.insert(d);
    }
    @GetMapping
    public List<Destino> listar(){
        return dService.list();
    }
}
