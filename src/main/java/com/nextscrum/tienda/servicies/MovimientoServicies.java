package com.nextscrum.tienda.servicies;

import com.nextscrum.tienda.modelo.MovimientoDinero;
import com.nextscrum.tienda.repositories.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MovimientoServicies {
    @Autowired
    MovimientoRepository movimientoRepository;

    public void crearyeditarMovimiento(MovimientoDinero movimientoDinero){
        movimientoRepository.save(movimientoDinero);
    }

    public List<MovimientoDinero> verMovimiento(){

        List<MovimientoDinero> movimientoDineros = new ArrayList<MovimientoDinero>();
        movimientoDineros.addAll(movimientoRepository.findAll());
        return movimientoDineros;
    }

    public void eliminarMovimiento(Long id){

        movimientoRepository.deleteById(id);

    }
}
