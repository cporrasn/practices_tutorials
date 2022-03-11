package com.cursoJava.cursoJava.controllers;

import com.cursoJava.cursoJava.DAO.UsuarioDAO;
import com.cursoJava.cursoJava.model.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
private UsuarioDAO usuarioDAO;
    @RequestMapping(value="/usuario/{id}")
    public List<Usuario> getUsuario(@PathVariable String id){
        return usuarioDAO.getUsuarios();
    }

    @RequestMapping(value="/usuario/editar")
    public Usuario editarUsuario(){
        Usuario user=new Usuario();
        user.setApellido("Porras");
        user.setTelefono("4444");
        user.setNombre("Cynthia");
        user.setEmail("Porras@gmail");
        user.setContrasenna("xxxx");
        return user;
    }

    @RequestMapping(value="/usuario/eliminar")
    public Usuario eliminarUsuario(){
        Usuario user=new Usuario();
        user.setApellido("Porras");
        user.setTelefono("4444");
        user.setNombre("Cynthia");
        user.setEmail("Porras@gmail");
        user.setContrasenna("xxxx");
        return user;
    }

    @RequestMapping(value="/usuario/buscar")
    public Usuario buscarUsuario(){
        Usuario user=new Usuario();
        user.setApellido("Porras");
        user.setTelefono("4444");
        user.setNombre("Cynthia");
        user.setEmail("Porras@gmail");
        user.setContrasenna("xxxx");
        return user;
    }
}
