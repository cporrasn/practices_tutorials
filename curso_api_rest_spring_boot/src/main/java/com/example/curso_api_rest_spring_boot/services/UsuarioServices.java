package com.example.API_REST.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioServices {
    @Autowired
    private UsuarioRepository repository;

    @Transactional(readOnly=true)
    public ArrayList<UsuarioModel> obtenerusuarios(){
        return (ArrayList<UsuarioModel>) repository.findAll();
    }

    @Transactional
    public UsuarioModel guardarUsuario(UsuarioModel usuarios){
        return repository.save(usuarios);
    }

    @Transactional(readOnly=true)
    public Optional<UsuarioModel> obtenerPorID(Integer id){
        return repository.findById(id);
    }

    @Transactional
    public void deleteUsuario(Integer id){
        repository.deleteById(id);
    }

    @Transactional(readOnly=true)
    public ArrayList<UsuarioModel> obtenerPorPrioridad(String nombre){
        return repository.findByNombre(nombre);
    }


}
