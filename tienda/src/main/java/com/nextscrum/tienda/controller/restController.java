package com.nextscrum.tienda.controller;

import com.nextscrum.tienda.modelo.Empleado;
import com.nextscrum.tienda.modelo.Empresa;
import com.nextscrum.tienda.modelo.MovimientoDinero;
import com.nextscrum.tienda.modelo.Perfil;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;


@RestController
public class restController {
    @GetMapping("/empresa")
    public String crearEmpresa(){
        Empresa miEmpresa = new Empresa(1234L,"NextScrum","12365","56589","kr 69 65 20",new ArrayList<Empleado>(),new ArrayList<MovimientoDinero>(), new Date(),new Date());
        return miEmpresa.toString();
        //return "has hecho una peticion get";
    }
    @GetMapping("/perfil")
    public String crearPerfil(){
        Perfil miPerfil = new Perfil("1235","imagen.jpg","3502356",new Empleado(),new Date(),new Date());
        return miPerfil.toString();
    }
}
