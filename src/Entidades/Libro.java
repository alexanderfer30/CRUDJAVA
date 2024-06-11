package Entidades;

public class Libro {

    int Id;
    String Titulo;
    String Autor;
    String Genero;

    public Libro(){

    }
    public Libro(int id, String titulo, String autor, String genero) {
        Id = id;
        Titulo = titulo;
        Autor = autor;
        Genero = genero;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
