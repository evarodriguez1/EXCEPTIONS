package n3ejercicio3;

public class Dispose {

	public int[] dispose(int numero) throws Exception {
		
		if (numero > 10) {
			throw new Exception("Tiene que ser un array menor a 10 posiciones");
		}else {
			int[] newArray = new int[numero];
			return newArray;
		}
		
	}
}
