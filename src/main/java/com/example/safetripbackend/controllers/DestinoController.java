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

    @PostMapping("new")
    public void registrar(@RequestBody Destino d) {
        dService.insert(d);
    }

    @GetMapping("/list")
    public List<Destino> listar() {
        return dService.list();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        dService.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody Destino d) {
        dService.insert(d);
    }

    @PostMapping("/buscar")
    List<Destino> buscar(@RequestBody Destino d) {
        return dService.search(d.getNameDestino());
    }
}
