package com.corhuila.parcial.service;

import com.corhuila.parcial.entity.Usuario;
import com.corhuila.parcial.iservice.iusuarioservice;
import com.corhuila.parcial.repository.iusuariorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usuarioservice implements iusuarioservice {

    @Autowired
    private iusuariorepository usuariorepository;

    @Override
    public List<Usuario> findAll() {
        return(List<Usuario>) usuariorepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return usuariorepository.findById(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuariorepository.save(usuario);
    }

    @Override
    public void update(Usuario usuario, Long id) {
        Optional<Usuario>us=usuariorepository.findById(id);
        if(!us.isEmpty()){
            Usuario usuarioUpdate=us.get();
            usuarioUpdate.setId_usuario(usuarioUpdate.getId_usuario());
            usuarioUpdate.setNombre(usuarioUpdate.getNombre());
            usuarioUpdate.setApellido(usuarioUpdate.getApellido());
            usuarioUpdate.setCorreo(usuarioUpdate.getCorreo());
            usuarioUpdate.setDireccion(usuarioUpdate.getDireccion());
            usuarioUpdate.setTelefono(usuarioUpdate.getTelefono());
            usuarioUpdate.setContraseña(usuarioUpdate.getContraseña());
            usuariorepository.save(usuarioUpdate);
        }else {
            System.out.println("No existe el usuario");
        }
    }
    @Override
    public void delete(Long id) {
        usuariorepository.deleteById(id);
    }
}
