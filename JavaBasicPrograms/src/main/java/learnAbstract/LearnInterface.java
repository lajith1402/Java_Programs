package learnAbstract;


public interface LearnInterface {
	
	String empName = "Ajeeth"; // declared variable is static, final and public by default
	
	
	/*public void emp() { // body should not be specified
		System.out.println("emp test");
	}*/
	
	void empDetails(); // by default the modifier type is public for interface
	
	void carDetails();
	
	public void autoDetails();
	
}
