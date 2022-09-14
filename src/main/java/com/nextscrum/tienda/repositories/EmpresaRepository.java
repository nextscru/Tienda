package com.nextscrum.tienda.repositories;

import com.nextscrum.tienda.modelo.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmpresa extends JpaRepository<Empresa ,Long> {
}
