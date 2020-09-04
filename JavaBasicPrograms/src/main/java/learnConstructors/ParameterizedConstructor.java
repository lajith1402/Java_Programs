package learnConstructors;

public class ParameterizedConstructor {

	String animal_name;
	int animal_id;

	// passing the values/args (parameters) in main method 
	
	ParameterizedConstructor(String name, int id) {
		animal_name=name;
		animal_id=id;
	}


	public void aboutAnimal() {
		System.out.println("Animal Name is: " +animal_name +"; " +"Animal ID is - "+animal_id);
	}

	public static void main(String[] args) {
		ParameterizedConstructor pc = new ParameterizedConstructor("Lion", 777);
		pc.aboutAnimal();
		
		ParameterizedConstructor pc1 = new ParameterizedConstructor("Bullock", 333);
		pc1.aboutAnimal();

	}

}
