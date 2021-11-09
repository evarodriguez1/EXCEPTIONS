package n1ejercicio5;
import java.io.*;

public class Main {
	public static void main(String[]args) {
		
		boolean continuar = true;
		
		while(continuar) {        
			       try {                
			    	   System.out.print("Introduce un número entero: ");
			    	   InputStreamReader datosInsertados = new InputStreamReader(System.in);
			    	   BufferedReader datos = new BufferedReader(datosInsertados);
			    	   String cadenaDatos = datos.readLine();
			    	   int numero = Integer.parseInt(cadenaDatos);
			    	   int cuadrado = numero * numero;
			    	   System.out.println("El cuadrado de " + numero + " = " + cuadrado);
			    	   continuar = false;
			       } catch(Exception e) {
			    	   System.out.println(e.getMessage()); 
			    	   System.out.println("Tipo de Exception:"+e.getClass());
			       }            
		};           
	}
}
