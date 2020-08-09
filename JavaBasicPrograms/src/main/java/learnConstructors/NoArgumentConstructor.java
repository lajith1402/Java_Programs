package learnConstructors;

public class NoArgumentConstructor {

	int empID;
	String empPlace;
	static String empName;

	// No argument or non-parametrized constructor example:
	NoArgumentConstructor() {  //No argument is passed to this constructor 
		empID = 1234;
		empName = "Ajith";
		System.out.println("No argument object is created: " +empID);
		System.out.println("No argument object is created: " +empPlace);

	}

	
	public static void main(String[] args) {
		NoArgumentConstructor emp = new NoArgumentConstructor();
		System.out.println("No argument object is created: " +empName); // can use the variable in main() method if it is static
	}

}
