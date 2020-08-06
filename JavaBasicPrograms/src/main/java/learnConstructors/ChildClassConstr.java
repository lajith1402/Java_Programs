package learnConstructors;

public class ChildClassConstr extends ParentClassConstr {  // use extends keyword to call the parent class
	
	public ChildClassConstr() {
		super();    // here the super() keyword is present by default for Parent - Child classes, even it is NOT visible   		
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		
		ChildClassConstr childclass = new ChildClassConstr();

	}

}
