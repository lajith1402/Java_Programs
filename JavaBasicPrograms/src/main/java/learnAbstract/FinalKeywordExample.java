package learnAbstract;

public class FinalKeywordExample {	
	String name = "Charan";
	final int i =20;
	int j = 30;
	
//	public abstract void add();
	
	public void multiples(int i, int j) {
				int product = i * j;
		System.out.println("Product value is: "+product);
	}
	

	public static void main(String[] args) {
		FinalKeywordExample finalKey = new FinalKeywordExample();
		finalKey.multiples(50, 40);  // need to check how come the final variable value is getting changed/updated.
		

	}

}
