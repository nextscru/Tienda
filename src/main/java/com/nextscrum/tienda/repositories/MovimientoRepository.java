package com.nextscrum.tienda.repositories;

import com.nextscrum.tienda.modelo.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository extends JpaRepository<MovimientoDinero, Long> {
}
