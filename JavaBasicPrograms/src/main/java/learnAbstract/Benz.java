package learnAbstract;

public class Benz extends CarParent {

	public void color() {
		System.out.println("My Benz car color is BLACK");
	}
	
	 /*Should add ALL abstract methods of parent class (CarParent.class) in this child class, otherwise make this class as abstract class,
	 and hence we cannot create object for this (abstract) class*/

	@Override
	public void engine() {
		System.out.println("My Benz engine is the best");
	}

	@Override
	public void speed() {
		System.out.println("My Benz speed is >300 mph");
	} 

	public static void main(String[] args) {
		CarParent benz = new Benz();  // using dynamic polymorphism
		benz.engine();
		benz.speed();

// should add ALL abstract methods of parent class in this child class, otherwise make this class as abstract class,
// and hence we cannot create object for this (abstract) class
		Benz ben = new Benz();
		ben.color();
		ben.engine();
		ben.speed();

	}

}
