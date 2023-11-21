package com.seruax.inventarios.service;

import com.seruax.inventarios.model.Producto;
import java.util.List;

public interface IProductoService {

    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public Producto guardarProducto(Producto producto);

    public void eliminarProductoPorId(Integer idProducto);

}
