package con.maven.mavenClass;

/**
 *
 * @author ross
 */
public class Director {
    
    private String nombre;
    private int id;
    private String apellido;

    public Director() {
    }
    

    public Director(String nombre, int id, String apellido) {
        this.nombre = nombre;
        this.id = id;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    
}
