package learnAbstract;

public abstract class Audi extends CarParent {
	//should inherit all abstract classes defined in parent class (CarParent.class), else change this child class as abstract

	public void brand() {
		System.out.println("My Audi brand is special");
	}

	public void speed() {
		System.out.println("Audi is high speed > 350 mph");
	}

	public abstract void drive();


	public static void main(String[] args) {
		// cannot create object for abstract class

		/*Audi adi = new Audi();
		adi.brand();
		adi.speed();
		adi.engine();
		 */
	}


}
