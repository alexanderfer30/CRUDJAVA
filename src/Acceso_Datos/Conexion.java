package Acceso_Datos;

public class Conexion {
    private  String driver ="com.mysql.cj.jdbc.Driver";
    private String url ="jdbc:mysql://127.0.0.1:3306/leenin";
    private String user ="root";
    private String pass="espejo";

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
