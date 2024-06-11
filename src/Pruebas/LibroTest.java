package Pruebas;

import Entidades.Libro;
import Logica_Negocio.Libro_BL;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.junit.jupiter.api.Assertions.*;
public class LibroTest {
    @org.junit.jupiter.api.Test
    void obtenerTodos() {
        var libroBL = new Libro_BL();
        var libro = libroBL.obtenerTodos();

        assertNotNull(libroBL,"la lista de libros no debe ser nulo");
        assertFalse(libro.isEmpty(),"la lista de libros no debe estar vacia");
    }

    @org.junit.jupiter.api.Test
    void guardar() {
        var libroBL = new Libro_BL();
        var libro = new Libro();
        libro.setAutor("Ernest Heminway");
        libro.setTitulo("El viejo y el Mar");
        libro.setGenero("Ficcion");

        int result = libroBL.guardar(libro);

        assertEquals(1,result,"Debe volver un uno ");
    }


    @org.junit.jupiter.api.Test
    void eliminar() {
        var libroBL = new Libro_BL();
        int result = libroBL.eliminar(10);
        assertEquals(1, result, "SE ELIMINO EL LIBRO");
    }
}
