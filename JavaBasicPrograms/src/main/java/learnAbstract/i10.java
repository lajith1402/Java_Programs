package learnAbstract;

public class i10 extends CarParent implements LearnInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Added parent class (carparent.class) Unimplemented methods to avoid changing the class to abstract
	@Override
	public void engine() {
		// TODO Auto-generated method stub		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub		
	}	
	
	public void price() {
		System.out.println("cost is high");
	}
	
	
	//Inherited LearnInterface.interface unimplemented methods
	public void empDetails() {
		// TODO Auto-generated method stub
		
	}

	public void carDetails() {
		// TODO Auto-generated method stub
		
	}

	public void autoDetails() {
		// TODO Auto-generated method stub
		
	}
	
	

}
