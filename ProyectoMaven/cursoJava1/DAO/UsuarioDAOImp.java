package com.cursoJava.cursoJava.DAO;

import com.cursoJava.cursoJava.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class UsuarioDAOImp implements UsuarioDAO{
    @Override
    public List<Usuario> getUsuarios() {

        Usuario user=new Usuario();
        user.setApellido("Porras");
        user.setId("id");
        user.setTelefono("4444");
        user.setNombre("Cynthia");
        user.setEmail("Porras@gmail");
        user.setContrasenna("xxxx");

        Usuario user1=new Usuario();
        user.setApellido("Porras");
        user.setId("id"+"3");
        user.setTelefono("4444");
        user.setNombre("Cynthia1");
        user.setEmail("Porras@gmail");
        user.setContrasenna("xxxx");

        Usuario user2=new Usuario();
        user.setApellido("Porras");
        user.setId("id"+"2");
        user.setTelefono("4444");
        user.setNombre("Cynthia2");
        user.setEmail("Porras@gmail");
        user.setContrasenna("xxxx");

        ArrayList<Usuario> lista=new ArrayList<>();
        lista.add(user);
        lista.add(user1);
        lista.add(user2);

        return lista;
    }
}
