package learnSamplePrograms;

import java.util.Scanner;

public class TrianglePatternStar {

	public static void main(String[] args) {
//		int rows, column = 0;
		
		Scanner scanner = new Scanner(System.in); // scanner class is used to enter value during run-time
		
		System.out.println("Enter number of lines to display:");
		
		int numberOfLines = scanner.nextInt(); //get the value as integer during runtime
	
		for(int rows=0; rows<numberOfLines; rows++) {
			
			for(int column=0; column<=rows; column++) {
				System.out.print("* ");
			}
			
			System.out.println("");
			
		}
		

	}

}
