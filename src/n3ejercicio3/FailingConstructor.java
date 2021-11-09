package n3ejercicio3;

public class FailingConstructor {
	
	int array[] = {1,2,3,4,5};
	
	int getValue(int index) {
		return array[index];
	}
	
	public FailingConstructor() {
		getValue(7);
	}
	
}
