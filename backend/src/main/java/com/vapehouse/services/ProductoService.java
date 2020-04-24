package com.vapehouse.services;

import java.util.List;

import com.vapehouse.entities.Producto;
import com.vapehouse.repositories.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listarProductos() {
        return productoRepository.getAllProductsByNumberOrder();
    }

    public Producto editarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public Producto insertarProducto(Producto producto){
        return productoRepository.save(producto);
    }
}