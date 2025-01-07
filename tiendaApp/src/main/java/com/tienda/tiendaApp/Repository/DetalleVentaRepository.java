package com.tienda.tiendaApp.Repository;

import com.tienda.tiendaApp.Model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
}