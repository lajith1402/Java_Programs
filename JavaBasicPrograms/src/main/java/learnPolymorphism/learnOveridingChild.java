package learnPolymorphism;

public class learnOveridingChild extends learnOveridingParent {
	
	
	@Override
	public void wedding() {
		System.out.println("My marriage my own rules");
	}
	
	@Override
	public void place() {   // created the same method with greater modifier in child class than parent class
		System.out.println("I can stay where I wish!!!");
	}

	public static void main(String[] args) {
		
		learnOveridingParent son = new learnOveridingChild(); // dynamic polymorphism - create reference as parent class, and obj for child class
		son.properties();
		son.wedding();
		son.place();

	}

}
