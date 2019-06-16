import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
	  	
        Persona persona = (Persona) Consultas.obtenerPorId(Persona.class, 1);
        System.out.print(persona);       

        persona.setApellido("Nodar");
        persona.setEdad(25);
        persona.setEsSocio(Boolean.TRUE);
    }
}
