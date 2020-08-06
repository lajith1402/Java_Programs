package learnConstructors;

public class DefaultConstructor {
	
	String name; // we use Wrapper class - o/p for class is null
	int id; // int is a primitive data type - o/p for data type is 0
	Integer number; // here Integer is a Wrapper class
		
	// Example for default constructor	
	// Here, we cannot see any constructors, so compiler will create a default constructor for us.
	
	/*DefaultConstructor() {  // no use of declaring default constructor for default type
		
	}*/

	public static void main(String[] args) {		

		DefaultConstructor student = new DefaultConstructor();
		System.out.println(student.name);
		System.out.println(student.id);
		System.out.println(student.number);
		
	}

}
