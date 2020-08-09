package staticMethodTypes;

public class LearnStaticBlock {
	
	static {
		System.out.println("static block num 1"); // All the static blocks will execute first before main() method
	}
	
	static {
		System.out.println("static block # 2");
	}

	static {
		System.out.println("static block # 3");
	}

		
	public static void main(String[] args) {
		System.out.println("main static method"); // main method will execute after all static methods 

	}

}
