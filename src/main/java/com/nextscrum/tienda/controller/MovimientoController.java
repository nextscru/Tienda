package com.nextscrum.tienda.controller;

import com.nextscrum.tienda.modelo.MovimientoDinero;
import com.nextscrum.tienda.servicies.MovimientoServicies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoController {

    @Autowired
    MovimientoServicies movimientoServicies;

    @GetMapping("/movimiento")
    private List<MovimientoDinero> verMovimiento() {
        return movimientoServicies.verMovimiento();
    }

    @PostMapping("/movimiento")
    private void crearMovimiento(@RequestBody MovimientoDinero movimientoDinero){
        movimientoServicies.crearyeditarMovimiento(movimientoDinero);
    }

    @DeleteMapping("movimiento/{id}")
    private void eliminarMovimiento(@PathVariable("id") Long id){
        movimientoServicies.eliminarMovimiento(id);
    }

    @GetMapping("movimiento/{id}")
    private MovimientoDinero verMovimientoPorId(@PathVariable("id") Long id){
        return movimientoServicies.verMovimientoPorId(id);
    }

    @PutMapping("/movimiento")
    private void editarMovimiento(@RequestBody MovimientoDinero movimientoDinero){
        movimientoServicies.crearyeditarMovimiento(movimientoDinero);
    }

}
