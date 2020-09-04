package learnFinalKeyword;

class FinalMethodExample {
	final int marks = 100;
	
	final void sample1() {
		int marks = 150;
		System.out.println("It is a final method - sample1");
		System.out.println("Max marks is: "+marks);
	}
	
	public void sample2() {
		System.out.println("It is a sample 2 method");
	}
	
}

class FinalMethod extends FinalMethodExample {		
	
	/* void sample1() {     // we cannot inherit the final methods into other class
		System.out.println("Method 2 new sample");
	}*/
	
	public void sample2() {
		System.out.println("Overrriding the method");
	}	
	
	public static void main(String[] args) {
		FinalMethod fm = new FinalMethod();
		fm.sample1();
		fm.sample2();		

	}
}
