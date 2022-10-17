package com.example.safetripbackend.controllers;

import com.example.safetripbackend.entities.Grupo;
import com.example.safetripbackend.serviceinterfaces.IGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {
    @Autowired
    private IGrupoService gService;
    @PostMapping
    public void registrar(@RequestBody Grupo g){
        gService.insert(g);
    }
    @GetMapping
    public List<Grupo> listar(){
        return gService.list();
    }
}
