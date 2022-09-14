package com.nextscrum.tienda.repositories;

import com.nextscrum.tienda.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

@Repository
public interface repositorio extends CrudRepository<Empleado, Long> {

    public abstract ArrayList<Empleado> findByPrioridad(Integer prioridad);

}
