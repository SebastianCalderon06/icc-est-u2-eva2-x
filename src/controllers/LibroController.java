package controllers;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Book;

public class LibroController {

        public Set<Book> procesarLibros(List<Book> libros) {
        Set<Book> resultado = new TreeSet<>();
        resultado.addAll(libros);
        return resultado;
    }
    
}
    

