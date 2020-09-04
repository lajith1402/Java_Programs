package learnFinalKeyword;

final class FinalClassExample {

	public void car() {
		System.out.println("final class example with sample");
	}

	final void bike() {
		System.out.println("Chekc for the final class functionality");
	}

	public static void main(String[] args) {
		FinalClassExample fc = new FinalClassExample();
		fc.car();
		fc.bike();	 
	}

} 

// cannot inherit the final class to any other sub class - compilation error will be thrown

// class Test extends FinalClassExample {  //compilation error is thrown
class Test {

	void demoPrg() {
		System.out.println("Check if we can inherit the 'final class' ");
	}

	void bike() {  // this method is not overridden as not able to inherit the final class
		System.out.println("check for the overridden method");
	}

	public static void main(String[] args) {
		Test test = new Test();
		//	test.car();
		test.bike();
		test.demoPrg();

	}

}
