package com.cursoJava.cursoJava.DAO;

import com.cursoJava.cursoJava.model.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class UsuarioDAOImp implements UsuarioDAO{

    @Override
    public List<Usuario> getUsuarios() {

        return lista;
    }
}
