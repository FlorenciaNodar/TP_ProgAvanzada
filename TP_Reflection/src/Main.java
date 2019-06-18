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
		/*Persona persona = new Persona("Matias", "Ramos", 32, "aksdasdasdas");
		Consultas.guardar(persona);*/
		      
        
		/////////////////////////*Eliminar una persona*//////////////////////////
		/*Persona persona = (Persona) Consultas.obtenerPorId(Persona.class, 9);     
        Consultas.eliminar(persona);*/
        
		
		/////////////////////////*Modificar una persona*/////////////////////////
		/*Persona persona = (Persona) Consultas.obtenerPorId(Persona.class, 2);     
        persona.setApellido("Rodríguez Peña");
        persona.setEdad(25);
        Consultas.modificar(persona);*/
		
		
		/////////////////////////*Modificar o crear una persona*/////////////////////////
		/*Persona persona = (Persona) Consultas.obtenerPorId(Persona.class, 10);	        
		persona.setApellido("sddsdsdsds");        
		persona.setNombre("fdsddd");
		persona.setEdad(22);
		persona.setDomicilio("Belgrano ddd");       
		persona.setId((Integer)Consultas.guardarModificar(persona));*/
        
	
    }
}
