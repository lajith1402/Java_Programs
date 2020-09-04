package learnPolymorphism;

public class learnOverridingwithParametersChild extends learnOverridingwithParametersParent {

	@Override
	public void add(int i, int j) {
		int sum = i +j;
		System.out.println("Sum is:" +sum);
	}

	@Override
	public void add(int i, long k) {  // can use the same method, same parameters and same implementation details
		long sum = i + k;
		System.out.println("Sum is long:" +sum);
	}


	public void add(int i, int j, int k) {  //this method won't be overridden as it has different parameters in child class
		int sum = i +j + k;
		System.out.println("Sum is:" +sum);
	}


	@Override
	public void printName() {
		System.out.println("Print child class statement");
	}

	
	public void checkOverriding(String name) { // same method in parent class but different parameters - so NO overriding
		System.out.println("Same Method used in parent class but without parameters" +name);
	}


	public static void main(String[] args) {

		learnOverridingwithParametersChild child = new learnOverridingwithParametersChild(); // can use this object as well
	//	learnOverridingwithParametersParent child = new learnOverridingwithParametersChild(); // dynamic polymorphism
		child.add(200, 200200200);
		child.add(10, 20, 30); // cannot execute this function if we use dynamic polymorphism as this method is not in parent class
		child.printName();
		child.checkOverriding("Charan");
		child.checkOverriding(100); //this method is present/used in parent class (int number)

	}

}
