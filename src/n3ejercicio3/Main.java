package n3ejercicio3;
import n3ejercicio2.FailingConstructor;

public class Main {
	public static void main(String[]args) {
		
		
		try {
			FailingConstructor fc = new  FailingConstructor();
			//fc.dispose();
		} catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
			System.out.println("Exception type: "+e.getClass());
		}
		
		Dispose dispose = new Dispose();
		
		try {
			dispose.dispose(11);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			System.out.println("Exception type: "+e.getClass());
		}
		
		
	}

}
