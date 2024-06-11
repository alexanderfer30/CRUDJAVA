package Acceso_Datos;

import Entidades.Libro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class LibroDAL {
    PreparedStatement ps;
    Conexion cn = new Conexion();

    public Connection getConexion() throws ClassNotFoundException, SQLException {
        Class.forName(cn.getDriver());

        return DriverManager.getConnection(
                cn.getUrl(),
                cn.getUser(),
                cn.getPass()
        );

    }

    public ArrayList<Libro> obtenerTodos(){
        var listLibro = new ArrayList<Libro>();

        try {
            ps=getConexion().prepareStatement("SELECT * FROM libro");
            var resultSet = ps.executeQuery();

            while (resultSet.next()){
                var libro = new Libro(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4)
                );

                listLibro.add(libro);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return listLibro;
    }

    public int guardar(Libro pLibro){
        int result =0;
        try {
            ps=getConexion().prepareStatement("INSERT INTO libro (titulo,autor,genero) values (?,?,?)");
            ps.setString(1,pLibro.getTitulo());
            ps.setString(2,pLibro.getAutor());
            ps.setString(3,pLibro.getGenero());
            result = ps.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }


    public int eliminar(int pId){
        int result =0;
        try {
            ps=getConexion().prepareStatement("DELETE FROM libro WHERE Id =? ");
            ps.setInt(1,pId);
            result = ps.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }

}
