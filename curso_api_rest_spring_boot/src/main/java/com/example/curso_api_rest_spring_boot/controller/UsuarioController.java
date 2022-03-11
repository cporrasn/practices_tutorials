package com.example.API_REST.controller;

import com.example.curso_api_rest_spring_boot.models.UsuarioModel;
import com.example.curso_api_rest_spring_boot.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioServices servicio;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return servicio.obtenerusuarios();
    }

    @GetMapping(path="/{id}")
    public Optional<UsuarioModel> obtenerUsuariosByID(@PathVariable("id") Integer id){
        return servicio.obtenerPorID(id);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuariosByNombre(@RequestParam("nombre") String nombre){
        return servicio.obtenerPorPrioridad(nombre);
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return servicio.guardarUsuario(usuario);
    }

    @PostMapping(path="/{id}")
    public void deleteUsuario(@PathVariable("id") Integer id){
        servicio.deleteUsuario(id);
    }

    @PostMapping()
    public ResponseEntity<Object> updateUsuario(@RequestBody UsuarioModel usuario, @PathVariable("id") Integer id){
        Optional<UsuarioModel>user=servicio.obtenerPorID(id);
        if(!user.isPresent()){
            return ResponseEntity.notFound().build();
        }
        
        user.get().setNombre(usuario.getNombre());
        user.get().setApellido(usuario.getApellido());
        user.get().setEmail(usuario.getEmail());
        user.get().setPass(usuario.getPass());
        user.get().setUser(usuario.getUser());
        return ResponseEntity.status(HttpStatus.CREATED).body(servicio.guardarUsuario(usuario));
    }


}
