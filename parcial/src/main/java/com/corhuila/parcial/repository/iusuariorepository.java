package com.corhuila.parcial.repository;


import com.corhuila.parcial.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iusuariorepository extends JpaRepository<Usuario,Long> {
}