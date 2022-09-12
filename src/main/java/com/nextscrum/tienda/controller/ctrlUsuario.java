package com.nextscrum.tienda.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import repositorio.repositorio;
import serviser.serviserUser;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/userh")
public class ctrlUsuario extends serviserUser {
    @Autowired(required = true)
    private serviserUser usuarioService;

    @GetMapping(value = "/users")
    public ArrayList<Empleado> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping(value ="/users")
    public Empleado guardarUsuario(@RequestBody Empleado usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @PatchMapping(value = "/user/{id}")
    public Optional<Empleado> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping(value = "/user/{id}")
    public ArrayList<Empleado> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }







   /*
   *
   *
   *
   *  @Autowired(required = true)
    private serviserUser usuarioService;

    @GetMapping(value = "/user")
    public ArrayList<Empleado> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping(value = "/user")
    public Empleado guardarUsuario(@RequestBody Empleado usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @PatchMapping(value = "/{id}")
    public Optional<Empleado> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping(value = "/query")
    public ArrayList<Empleado> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }
   *
   *
   *
   * */




}