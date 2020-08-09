package learnLoopingConcepts;

public class ForLoopExample {

	public static void main(String[] args) {
		
		// Example for For loop
		for(int times=0; times<= 25; times++) {
			System.out.println("My Name is Ajith");
		}

		
		// Example for While loop
		int i = 1;
		while (i<=25) {
			System.out.println("Counting add by 1  is: " +i);
			i++;
		}
	
		
		// Example for do - While loop
		int count = 0;
		do {
			System.out.println("Verify and increase value by 1: " +count);
			count++;			
		}
		while(count <=25);
		
	}

}
