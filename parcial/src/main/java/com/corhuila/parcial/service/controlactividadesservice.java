package com.corhuila.parcial.service;

import com.corhuila.parcial.entity.ControlActividades;
import com.corhuila.parcial.iservice.icontrolactividadesservice;
import com.corhuila.parcial.repository.icontrolactividadesrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class controlactividadesservice implements icontrolactividadesservice {

    @Autowired
    private icontrolactividadesrepository controlactividadesrepository;

    @Override
    public List<ControlActividades> findAll() {
        return(List<ControlActividades>) controlactividadesrepository.findAll();
    }

    @Override
    public Optional<ControlActividades> findById(Long id) {
        return controlactividadesrepository.findById(id);
    }

    @Override
    public ControlActividades save(ControlActividades controlActividades) {
        return controlactividadesrepository.save(controlActividades);
    }

    @Override
    public void update(ControlActividades controlActividades, Long id) {
        Optional<ControlActividades>us=controlactividadesrepository.findById(id);
        if(!us.isEmpty()){
            ControlActividades controlActividadesUpdate=us.get();
            controlActividadesUpdate.setCodigo_actividad(controlActividadesUpdate.getCodigo_actividad());
            controlActividadesUpdate.setFecha(controlActividadesUpdate.getFecha());
            controlActividadesUpdate.setNombre(controlActividadesUpdate.getNombre());
            controlActividadesUpdate.setDescripcion(controlActividadesUpdate.getDescripcion());
            controlactividadesrepository.save(controlActividadesUpdate);
        }else {
            System.out.println("No existe la actividad");
        }
    }
    @Override
    public void delete(Long id) {
        controlactividadesrepository.deleteById(id);
    }
}