package com.example.API_REST.repository;

import com.example.curso_api_rest_spring_boot.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
    ArrayList<UsuarioModel> findByNombre(String nombre);
}
