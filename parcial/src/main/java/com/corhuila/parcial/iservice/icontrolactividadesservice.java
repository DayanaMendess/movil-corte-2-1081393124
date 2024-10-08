package com.corhuila.parcial.iservice;

import com.corhuila.parcial.entity.ControlActividades;

import java.util.List;
import java.util.Optional;

public interface icontrolactividadesservice {
    List<ControlActividades> findAll();
    Optional<ControlActividades> findById(Long id);
    ControlActividades save(ControlActividades controlActividades);
    void update(ControlActividades controlActividades, Long id);
    void delete(Long id);
}

