package CRUD.controller;

import CRUD.exception.ResourceNotFoundException;
import CRUD.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import CRUD.repository.*;

import java.util.List;

//@RestController
//@RequestMapping("/api/v1")
@Controller
public class EmpleadosController {
    
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @GetMapping(value="")
    public String showHomePage(){
        return "index";
    }

    /*@GetMapping("/empleados")
    public List<Empleado> getEmpleados(){
        return empleadoRepositorio.findAll();
    }

    @PostMapping("/empleados/add")
    public Empleado crearEmpleado(Empleado e){
        return empleadoRepositorio.save(e);
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity getEmpleadoByID(@PathVariable(name = "id") long id) throws ResourceNotFoundException {
        Empleado em= empleadoRepositorio.findById(id).orElseThrow(()->new org.apache.velocity.exception.ResourceNotFoundException("El empleado no está"));
        return ResponseEntity.ok().build();
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> modificarEmpleado(@PathVariable(name = "id" )long id,@RequestBody Empleado emp ) throws ResourceNotFoundException {
        Empleado em= empleadoRepositorio.findById(id).orElseThrow(()->new org.apache.velocity.exception.ResourceNotFoundException("El empleado no está"));
        em.setApellidos(emp.getApellidos());
        em.setNombre(emp.getNombre());
        em.setEmailID(emp.getEmailID());
        empleadoRepositorio.save(emp);
        return ResponseEntity.ok().body(em);
    }

    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Empleado> crearEmpleado(@PathVariable(name = "id" )long id){
        Empleado em= empleadoRepositorio.findById(id).orElseThrow(()->new org.apache.velocity.exception.ResourceNotFoundException("El empleado no está"));
        empleadoRepositorio.deleteById(id);
        return ResponseEntity.ok().body(em);
    }*/
}
