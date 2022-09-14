package com.nextscrum.tienda.servicies;


import com.nextscrum.tienda.modelo.Empleado;
import com.nextscrum.tienda.repositories.repositorio;
import org.springframework.beans.factory.annotation.*;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class serviserUser {

    @Autowired(required = true)
    private repositorio usuarioRepository;

    public ArrayList<Empleado> obtenerUsuarios(){

        return (ArrayList<Empleado>) usuarioRepository.findAll();
    }

    public Empleado guardarUsuario(Empleado usuario){

        return usuarioRepository.save(usuario);
    }

    public Optional<Empleado> obtenerPorId(Long id){

        return usuarioRepository.findById(id);
    }


    public ArrayList<Empleado> obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


}
