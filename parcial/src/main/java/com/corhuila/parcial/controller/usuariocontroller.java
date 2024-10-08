package com.corhuila.parcial.controller;

import com.corhuila.parcial.entity.Usuario;
import com.corhuila.parcial.iservice.iusuarioservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class usuariocontroller {

    @Autowired
    private iusuarioservice usuarioService;

    @GetMapping()
    public List<Usuario> findALL(){
        return usuarioService.findAll();
    }

    //Método para Listar

    @GetMapping("/{id}")
    public Optional<Usuario> findById(@PathVariable Long id){
        return usuarioService.findById(id);
    }
    //Metodo para crear el usuario

    @PostMapping()
    public Usuario save(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);}

    //Método para Actualizar el usuario por Id

    @PutMapping("/{id}")
    public void update(@RequestBody Usuario usuario, @PathVariable Long id){
        usuarioService.update(usuario, id);
    }

    //Método para eliminar el usuario por Id

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        usuarioService.delete(id);
    }
}