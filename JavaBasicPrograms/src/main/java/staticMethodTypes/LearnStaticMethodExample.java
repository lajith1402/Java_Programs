package staticMethodTypes;

public class LearnStaticMethodExample {
	
	public static void staticMethod() {
//		nonStatic(); // cannot call non-static methods to any other methods to execute it except main() method by creating/using object
		System.out.println("It is Static Method");
	}

	
	public void nonStatic() {
		staticMethod(); // can call a static method to any static or non-static methods simply without creating object
		System.out.println("It is non-static method");
	}
	
	public static void main(String[] args) {
		staticMethod(); //no need (not necessary) to create object for static methods
		
		LearnStaticMethodExample stac = new LearnStaticMethodExample();
		stac.nonStatic(); // need object to call non-static method(s)			

		System.out.println("main method");
	}

}
