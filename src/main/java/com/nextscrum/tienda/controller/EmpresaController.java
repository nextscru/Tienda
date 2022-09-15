package com.nextscrum.tienda.controller;

import com.nextscrum.tienda.modelo.Empresa;
import com.nextscrum.tienda.servicies.EmpresaServicies;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmpresaController {

    @Autowired
    EmpresaServicies empresaServicies;

    @GetMapping("/empresa")
    private List<Empresa> verEmpresa(){
        return empresaServicies.verEmpresa();
    }

    @PostMapping("/empresa")
    public void crearEmpresa(@RequestBody Empresa empresa){
        empresaServicies.crearyeditarEmpresa(empresa);

    }
    @DeleteMapping("/empresa/{id}")
    private void eliminarEmpresa(@PathVariable("id") Long id){
        empresaServicies.eliminarEmpresa(id);
    }
}
