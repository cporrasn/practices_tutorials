package com.cursoJava.cursoJava.DAO;

import com.cursoJava.cursoJava.model.Usuario;

import java.util.List;

public interface UsuarioDAO {

    List<Usuario> getUsuarios();
    void insertarUsuario(Usuario user);
    void modificarUsuario(int id, Usuario user);
    void eliminarUsuario(int id, Usuario user);
}
