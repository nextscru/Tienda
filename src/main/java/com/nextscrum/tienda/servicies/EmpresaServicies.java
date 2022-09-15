package com.nextscrum.tienda.servicies;

import com.nextscrum.tienda.modelo.Empresa;
import com.nextscrum.tienda.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaServicies {

    @Autowired
    EmpresaRepository repositoryEmpresa;

    public void crearyeditarEmpresa(Empresa empresa){
        repositoryEmpresa.save(empresa);

    }

    public List<Empresa> verEmpresa(){

        List<Empresa> empresas = new ArrayList<Empresa>();
        empresas.addAll(repositoryEmpresa.findAll());
        return empresas;
    }
    public void eliminarEmpresa(Long id){
        repositoryEmpresa.deleteById(id);
    }


}
