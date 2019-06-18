import Anotaciones.Columna;
import Anotaciones.Id;
import Anotaciones.Tabla;

@Tabla(nombre = "Personas")
public class Persona {
    
    @Id
    private Integer id;
    
    @Columna(nombre = "nombre")
    private String nombre;
    
    @Columna(nombre = "apellido")
    private String apellido;
    
    @Columna(nombre = "edad")
    private Integer edad;

    @Columna(nombre = "domicilio")
    private String domicilio;
    
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad,String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.edad = edad;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Id: " + this.id + " Nombre: " + this.nombre + " Apellido: " + this.apellido + " Edad: " + this.edad+ " Domicilio: " + this.domicilio;
    }
}
