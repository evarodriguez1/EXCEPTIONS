package n2ejercicio2;
import java.util.InputMismatchException;

public class MyException {
	
	public void f() throws RuntimeException{
		
		try {
			
			g();
			
		} catch(RuntimeException e) {
			
		}
		
	}
	
	public void g() {
		try {
			
			String message = "Exception types";
			throw new InputMismatchException(message);
			
		} catch(InputMismatchException e) {
			
			System.out.println(e.getMessage());
			
		}
	}

}
