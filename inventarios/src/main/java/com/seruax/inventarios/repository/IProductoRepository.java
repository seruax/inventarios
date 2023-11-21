package com.seruax.inventarios.repository;

import com.seruax.inventarios.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {
}
