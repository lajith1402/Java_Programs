package learnExceptions;

public class ExceptionHandleExample {	


	public static void main(String[] args) {

		try {
			int i = 5;
			int j = 0;
			int result = i/j;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("should not divide any number by '0'");
		}

		catch(NullPointerException e) {
			System.out.println("No elements found");
		}

		// Exception is a parent class for all other exceptions, and if it is first, then following exceptions will not be executed
		catch (Exception e) {   // "Exception" is a parent exception for all other exception types & this should come at last only
			e.printStackTrace();
			System.out.println();
		}

	}

}
