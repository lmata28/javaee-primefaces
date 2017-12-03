package com.tecsup.jsfprime.bean;

import com.tecsup.jsfprime.model.Categoria;
import com.tecsup.jsfprime.model.Producto;
import com.tecsup.jsfprime.service.GestionProducto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CategoriaBean {
    
    private List<Categoria> categorias;
    private List<Producto> productos;
    
    public CategoriaBean() {
        GestionProducto gestion = new GestionProducto();
        this.categorias = gestion.listar();
        this.productos = gestion.listarPorCategoria(1l);
        
        System.out.println("TOTAL CATEGORIA  " + this.categorias.size());
    }
    
    public void cargarProductos(Long categoria) {
        GestionProducto gestion = new GestionProducto();
        this.productos = gestion.listarPorCategoria(categoria);
        
        System.out.println("TOTAL PRODUCTOS  " + this.productos.size());
    }
    
    
    public List<Categoria> getCategorias() {
        return categorias;
    }
    
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    public List<Producto> getProductos() {
        return productos;
    }
    
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
}
