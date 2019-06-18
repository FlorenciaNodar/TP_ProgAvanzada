import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import Servicios.Consultas;
import Utilidades.UConexion;


public class Main {
  public static void main(String[] args){
	  	
		try {
			Properties prop=new Properties();
		  	FileInputStream ip;
			ip = new FileInputStream("src/framework.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        UConexion.setUrl(prop.getProperty("url"));

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/////////////////////////*Crear una persona*///////////////////////////
		
		/*Persona persona = new Persona("Marianela", "Suarez", 32, "Belgrano 22");
		persona.setId((Integer)Consultas.guardar(persona));       */         
        
		/////////////////////////*Eliminar una persona*//////////////////////////
		/*Persona persona = (Persona) Consultas.obtenerPorId(Persona.class, 1);     
        Consultas.eliminar(persona);*/
        
		
		/////////////////////////*Modificar una persona*/////////////////////////
		/*Persona persona = (Persona) Consultas.obtenerPorId(Persona.class, 2);     
        persona.setApellido("Rodríguez Peña");
        persona.setEdad(25);
        Consultas.modificar(persona);*/
		
		
		/////////////////////////*Modificar o crear una persona*/////////////////////////
		/*Persona persona = (Persona) Consultas.obtenerPorId(Persona.class, 7);	        
		persona.setApellido("sddsdsdsds");        
		persona.setNombre("fdsddd");
		persona.setEdad(22);
		persona.setDomicilio("Belgrano ddd");       
		persona.setId((Integer)Consultas.guardarModificar(persona));*/
        
		
		////////////////////////////*TraerTodosLosRegistros*//////////////////////////////////
		List<Object> objetos = Consultas.obtenerTodos(Persona.class);
        
        System.out.println(objetos);
    }
}
