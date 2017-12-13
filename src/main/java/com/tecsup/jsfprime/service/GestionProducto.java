package com.tecsup.jsfprime.service;

import com.tecsup.jsfprime.model.Categoria;
import com.tecsup.jsfprime.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class GestionProducto {

    public List<Categoria> listar() {
        List<Categoria> categorias = new ArrayList();

        categorias.add(new Categoria(1l, "Libros Terror","Libros"));
        categorias.add(new Categoria(2l, "Electrónicos de Pc", "Electrónicos"));
        categorias.add(new Categoria(3l, "Niñas Christmas","Niñas"));
        categorias.add(new Categoria(4l, "Adolescentes Cds", "Musica"));
        categorias.add(new Categoria(5l, "Libros Terror","Libros"));
        categorias.add(new Categoria(6l, "Electrónicos de Pc", "Electrónicos"));
        categorias.add(new Categoria(7l, "Niñas Christmas","Niñas"));
        categorias.add(new Categoria(8l, "Adolescentes Cds", "Musica"));
        categorias.add(new Categoria(9l, "Libros Terror","Libros"));
        categorias.add(new Categoria(10l, "Electrónicos de Pc", "Electrónicos"));
        categorias.add(new Categoria(11l, "Niñas Christmas","Niñas"));
        categorias.add(new Categoria(12l, "Adolescentes Cds", "Musica"));
        
        return categorias;
    }

    public List<Producto> listarPorCategoria(Long id) {

        List<Producto> productos = new ArrayList();
        productos.add(new Producto(1l, "Viajes de Guilliver", "Intersante", "http://goo.gl/ZfzzmP"));
        productos.add(new Producto(2l, "La isla del tesoro", "Aventuras", "http://goo.gl/ZfzzmP"));
        productos.add(new Producto(3l, "Las aventuras de Tom Sawyer", "Divertido", "http://goo.gl/ZfzzmP"));
        productos.add(new Producto(4l, "TV LG 3D SMART XYZ ", "WOW", "http://bit.ly/1KJxmwF"));
        productos.add(new Producto(5l, "PlayStation 4", "Diversión a toda hora", "http://bit.ly/1KJxmwF"));
        productos.add(new Producto(6l, "HomeTheater", "Mejor sonido.", "http://bit.ly/1KJxmwF"));
        productos.add(new Producto(7l, "Set Dinosaurios JW", "WOW", "http://bit.ly/1KJxmwF"));
        productos.add(new Producto(8l, "Iron Man", "El personaje favorito", "http://bit.ly/1KJxmwF"));
        productos.add(new Producto(9l, "Monster Girl", "Muñecas para niñas de hoy.","http://bit.ly/1KJxmwF"));
        productos.add(new Producto(10l, "Caricatura", "Jorge el curioso.","http://goo.gl/ZfzzmP"));
        productos.add(new Producto(11l, "Caricatura", "Jorge el curioso ii.","http://goo.gl/ZfzzmP"));

        List<Producto> respuesta = new ArrayList();
        switch (id.intValue()) {
            case 1:
                respuesta = productos.subList(0, 3);
                break;
            case 2:
                respuesta = productos.subList(3, 6);
                break;
            case 3:
                respuesta = productos.subList(6, 9);
                break;
            case 4:
                respuesta = productos.subList(9, 11);
                break;    
            case 0:
                respuesta = productos;
        }
        return respuesta;
    }

}
