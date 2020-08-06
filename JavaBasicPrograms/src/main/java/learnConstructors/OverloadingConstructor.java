package learnConstructors;

public class OverloadingConstructor {
	
	String animal_name;
	int animal_id;
	
	OverloadingConstructor() {
		System.out.println("It is a No argument constructor");
	}
	
	OverloadingConstructor(String name) {   // overloading the same constructor by passing a parameter
		animal_name=name;
		System.out.println("Name of the animal is: "+ animal_name);		
	}
	
	OverloadingConstructor(String name, int id)  { // overloading the same constructor by passing 2 parameter values in main()
	//	animal_name=name;
		animal_id = id;
		System.out.println("Animal name: " +animal_name +" ID is: " +animal_id);
	}	
		

	public static void main(String[] args) {
		OverloadingConstructor overLoad1 = new OverloadingConstructor(); // it calls the no argument constructor
		OverloadingConstructor overload2 = new OverloadingConstructor("LION"); // it calls the parameterized constructor
		OverloadingConstructor overload3 = new OverloadingConstructor("LION", 12334); 
	}

}
