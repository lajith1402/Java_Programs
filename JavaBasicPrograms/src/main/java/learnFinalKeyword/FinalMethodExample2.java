package learnFinalKeyword;

public class FinalMethodExample2 extends FinalMethodExample {
	
	/*void sample1() {   // unable to override the final methods into other class
		System.out.println("Trying to override the 'final' method from parent class");
	}*/
	
	@Override
	public void sample2() {
		System.out.println("This is method is overridden from the parent class");
		
	}
	
	public void marks() {
		System.out.println("Max Marks declared is: " +marks);
	}
	

	public static void main(String[] args) {
		FinalMethodExample2 fm2 = new FinalMethodExample2();
		fm2.sample2();
		fm2.sample1();	

	}

}
