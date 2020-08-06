package learnConstructors;

public class NoArgumentConstructor {

	int empID;
	String empName;

	// No argument or non-parametrized constructor example:
	NoArgumentConstructor() {  //No argument is passed to this constructor 
		empID = 1234;
		empName = "Ajith";
		System.out.println("No argument object is created: " +empID);
	}

	
	public static void main(String[] args) {
		NoArgumentConstructor emp = new NoArgumentConstructor();
	}

}
