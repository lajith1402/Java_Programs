package learnPolymorphism;

public class learnOverLoadExample {
	
	public int add (int i, int j) {
		int k = i + j;
		System.out.println("Adding 2 numbers are: "+k);
		return k;
	}
	
	/*public int add (int a, int b) { // cannot create with same data type which already exists; must be some change in data type
		int sum = a + b;
		System.out.println("Adding 2 numbers are: "+sum);
		return sum;
	}*/
	
	public void add(int i, int j, int n) {
		int k = i + j + n;
		System.out.println("Adding 3 numbers are: "+k);
		
	}
	
	public float add(float i, float j) {
		float k = i + j;
		System.out.println("Adding 2 float numbers are: "+k);
		return k;
		
	}
	
	public void add(double i, double j) {
		double k = i + j;
		System.out.println("Adding 2 dec numbers are: "+k);
		
	}

	public static void main(String[] args) {
		learnOverLoadExample calc = new learnOverLoadExample();
		
		calc.add(22, 25);  // int values
		calc.add(10.9876, 20.23543); //double values
		calc.add(12.5, 13.5); //float values		
		calc.add(50, 30, 80);
		calc.add(150, 350);

	}

}
