package n1ejercicio2;

public class Main {
	public static void main(String[]args) {
		
		 ExceptionNull exNull = null;
		      try {
		          exNull.getString();
		        } catch (Exception e){
		           System.out.println("Se produjo una expci�n. " + e.getMessage());
		           System.out.println("Tipo de Exception:"+e.getClass());
		        }
	}
}
