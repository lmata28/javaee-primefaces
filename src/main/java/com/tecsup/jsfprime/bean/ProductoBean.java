/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.jsfprime.bean;

import com.tecsup.jsfprime.model.Producto;
import com.tecsup.jsfprime.service.GestionProducto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ProductoBean {
    
    private List<Producto> productos;
    private Producto productoSeleccionado;

    public ProductoBean() {
        GestionProducto gestion = new GestionProducto();
        this.productos = gestion.listarPorCategoria(0l);
    }
    
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(Producto productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }
    
    
    
}
