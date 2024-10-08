package com.corhuila.parcial.iservice;

import com.corhuila.parcial.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface iusuarioservice {

    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);
    Usuario save(Usuario usuario);
    void update(Usuario usuario, Long id);
    void delete(Long id);
}

