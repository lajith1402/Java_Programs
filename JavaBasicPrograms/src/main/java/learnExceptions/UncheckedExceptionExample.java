package learnExceptions;

public class UncheckedExceptionExample {

	static String name;

	public static void main(String[] args) {
	//	name = "tell";
		
		System.out.println(name.length()); //throws run time exception as we have not declared value for 'name' variable 
	// null pointer exception is thrown here as name value is null by default

	}

}
