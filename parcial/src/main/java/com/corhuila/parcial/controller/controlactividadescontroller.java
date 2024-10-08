package com.corhuila.parcial.controller;

import com.corhuila.parcial.entity.ControlActividades;
import com.corhuila.parcial.iservice.icontrolactividadesservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/actividades")
public class controlactividadescontroller {
    @Autowired
    private icontrolactividadesservice controlActividadesService;

    @GetMapping("/actividades")
    public List<ControlActividades> findALL(){
        return controlActividadesService.findAll();
    }


    @GetMapping("/actividades/{id}")
    public Optional<ControlActividades> findById(@PathVariable Long id){
        return controlActividadesService.findById(id);
    }


    @PostMapping("/actividades")
    public ControlActividades save(@RequestBody ControlActividades controlActividades){
        return controlActividadesService.save(controlActividades);}


    @PutMapping("/actividades/{id}")
    public void update(@RequestBody ControlActividades controlActividades, @PathVariable Long id){
        controlActividadesService.update(controlActividades, id);
    }

    @DeleteMapping("/actividades/{id}")
    public void delete(@PathVariable Long id){
        controlActividadesService.delete(id);
    }
}
