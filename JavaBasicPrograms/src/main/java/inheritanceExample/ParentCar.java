package inheritanceExample;

public class ParentCar {

    public	int wheels = 4;
	int speed = 300;
	String body = "Metallic grey";
	
	public void drive() {
		if (speed > 300) {
			System.out.println("overspeed");
		}
		else if(speed <= 300) {
			System.out.println("slow speed");
		}
		else {
			System.out.println("only wheels: " +wheels);
		}
		System.out.println("body color is: " +body);
		
	}
}
