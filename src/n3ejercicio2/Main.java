package n3ejercicio2;

public class Main {
	
	public static void main(String[]args) {
		
		try {
			FailingConstructor fc = new  FailingConstructor();
		} catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
			System.out.println("Exception type:"+e.getClass());
		}
	}
}
