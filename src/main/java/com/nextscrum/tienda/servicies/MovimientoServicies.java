package com.nextscrum.tienda.servicies;

import com.nextscrum.tienda.modelo.MovimientoDinero;
import com.nextscrum.tienda.repositories.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MovimientoServicies {
    @Autowired
    MovimientoRepository movimientoRepository;

    public void crearyeditarMovimiento(MovimientoDinero movimientoDinero){
        movimientoRepository.save(movimientoDinero);
    }

    public List<MovimientoDinero> verMovimiento(){
        return movimientoRepository.findAll();
    }

    public void eliminarMovimiento(Long id){

        movimientoRepository.deleteById(id);

    }

    public MovimientoDinero verMovimientoPorId(Long id) {
        return movimientoRepository.findById(id).get();
    }
}
