package n1ejercicio3;

public class Main {
	public static void main(String[]args) {
		
		ExceptionOnArray exArray = new ExceptionOnArray();
		 
		 try {
			 exArray.getValue(6);
		 } catch (ArrayIndexOutOfBoundsException e) {
		     System.out.println("Exception: indice de array fuera de limites" + e.getMessage());
		     System.out.println("Tipo de Exception:"+e.getClass());
		 }
	}
	
}
