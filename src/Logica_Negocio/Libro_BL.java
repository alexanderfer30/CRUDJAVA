package Logica_Negocio;

import Acceso_Datos.LibroDAL;
import Entidades.Libro;

import java.util.ArrayList;

public class Libro_BL {
    private static LibroDAL _dbLibro = new LibroDAL();

    public ArrayList<Libro> obtenerTodos(){
        return _dbLibro.obtenerTodos();
    }

    public int guardar(Libro pLibro){
        return _dbLibro.guardar(pLibro);
    }

    public int eliminar (int pId){
        return _dbLibro.eliminar(pId);
    }
}
