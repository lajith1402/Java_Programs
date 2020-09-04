package learnPolymorphism;

public class learnOverridingwithParametersParent {
	
	/*int i = 10;
	int j = 20;
	long k = 400500600;
	String name;*/
	
	public void add(int i, int j) {
		int sum = i + j;
		System.out.println("Sum value is in Integer: "+sum); 
	}
	
	public void add(int i, long k) {
		long sum = i + k;
		System.out.println("Sum is long:" +sum);
	}
	
	
	public void printName(String name) {
		System.out.println("Name is:" +name);		
	}
	
	
	public void printName() {
		System.out.println("check for overrriding concept");
	}
	
	public void checkOverriding() {
		System.out.println("Check if the method is overriding");
	}
	
	public void checkOverriding(int number) {
		System.out.println("Check if the method is overriding in parent class: "+number);
	}
	

	public static void main(String[] args) {
		
		learnOverridingwithParametersParent parent = new learnOverridingwithParametersParent();
		parent.add(50, 40);
		parent.printName("Ajeeth Kumar");
//		parent.add(10, 20, 30);
		parent.printName();
		parent.checkOverriding(2500);
		
	}

}
