
package con.maven.mavenEntity;

import con.maven.mavenClass.Director;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ross
 */


@Entity
@Table(name="director")
public class DirectorEntity implements Serializable {

    public DirectorEntity() {
    }

    
    public DirectorEntity(Director dir) {
        this.id = dir.getId();
        this.apellido = dir.getApellido();
        this.nombre = dir.getNombre();
    
    }
    
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="nombre")
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Column(name="apellido")
    private String apellido;
    
}
