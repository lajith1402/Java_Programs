package learnSamplePrograms;

import java.util.Scanner;

public class TrianglePatterNumbers {

	public void triangleNums1() {

		Scanner scanner = new Scanner(System.in); //scan the entered value during runtime and store it
		System.out.println("Enter the number of values:"); // enter the number after executed this statement
		int enteredValue = scanner.nextInt(); //entered number is stored as integer in 'enteredValue' variable

		for(int rows=1; rows<enteredValue; rows++) {

			for(int column=1; column<=rows; column++) {
				
				System.out.print(column +"");							
			}
			System.out.println();
		}

	}


	//	Use another method to print values from 1,2,3, etc on both the sides (rows and columns)	

	public static void triangleNumOrder() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numeric value:");
		int numValue = scanner.nextInt();

		for(int i=1; i<numValue; i++) {

			for (int j=1; j<=i; j++) {

				System.out.print(i+"" );
			}
			System.out.println();
		}

	}


	public static void main(String[] args) {
		triangleNumOrder();  // no need to create object for static methods or static variables

		TrianglePatterNumbers tri = new TrianglePatterNumbers(); //object need to be created for non-static methods
		tri.triangleNums1();
		
	}

}
