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
    
    @Columna(nombre = "socio")
    private Boolean esSocio;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Boolean esSocio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.esSocio = esSocio;
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

    public Boolean getEsSocio() {
        return esSocio;
    }

    public void setEsSocio(Boolean esSocio) {
        this.esSocio = esSocio;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + " Nombre: " + this.nombre + " Apellido: " + this.apellido + " Edad: " + this.edad + " EsSocio: " + this.esSocio;
    }
}
