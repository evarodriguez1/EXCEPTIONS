package n1ejercicio1;

public class Main {

	public static void main(String[]args) {
		try {
			throw new Exception("Exception on try");
		}catch(Exception e) {
			System.out.println("Se produjo la siguiente exception:"+e.getMessage());
			System.out.println("Tipo de Exception:"+e.getClass());
		}
		finally {
			System.out.println("A pesar de la excpetion pasamos por aquí.");
		}
	}
}
