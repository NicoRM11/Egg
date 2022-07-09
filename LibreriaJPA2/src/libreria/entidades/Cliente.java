
package libreria.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
    //atributos
    @Id
    private String id;
    private long dni;
    private String nombre;
    private String apellido;
    private String telefono;
    //get y set

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //to String

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + '}';
    }
    
}
