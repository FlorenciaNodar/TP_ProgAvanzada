import Servicios.Consultas;
import Utilidades.UConexion;


public class Main {
  public static void main(String[] args) {
        
        UConexion.setUrl("jdbc:sqlserver://cleanarchitecturedemo.database.windows.net;database=Reflection;user=sqladmin;password=P@assword1;");
        Persona persona = (Persona) Consultas.obtenerPorId(Persona.class, 1);
        System.out.print(persona);       

        persona.setApellido("Nodar");
        persona.setEdad(25);
        persona.setEsSocio(Boolean.TRUE);
    }
}
