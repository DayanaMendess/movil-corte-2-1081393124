package com.corhuila.parcial.repository;


import com.corhuila.parcial.entity.ControlActividades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface icontrolactividadesrepository extends JpaRepository <ControlActividades,Long> {
}
