package com.seruax.inventarios.service;

import com.seruax.inventarios.model.Producto;
import com.seruax.inventarios.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private IProductoRepository productoRepo;

    @Override
    public List<Producto> listarProductos() {
        return productoRepo.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        return productoRepo.findById(idProducto).orElse(null);
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepo.save(producto);
    }

    @Override
    public void eliminarProductoPorId(Integer idProducto) {
        productoRepo.deleteById(idProducto);
    }
}
