package learnSamplePrograms;

import java.util.Scanner;

public class ReverseNumberName {

	public void reverseNumber() {
		int reverse = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numeric value: "); //use Scanner class to enter input during run-time
		int num = scanner.nextInt();

		while(num != 0) {
			int digits = num%10;  //given number (796345) is divided by 10 and stored the reminder in digits variable
			reverse = reverse*10 + digits; // (0 * 10) + 5 = 5
			num/=10;
		}

		System.out.println("The reverse value of the given number is: "+reverse);
	}

	
	public static void reverseString() {
		StringBuffer name = new StringBuffer("Ajeeth");
		System.out.println("Given name is: " +name);
		name.reverse();
		System.out.println("Reverse name is: "+name);
	}
	

	public static void main(String args[]) {
		ReverseNumberName numName = new ReverseNumberName();
		numName.reverseNumber();
		
		reverseString();	

	}	

}
