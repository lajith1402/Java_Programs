package inheritanceExample;

public class ParentCar {

	static	int wheels = 4;
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
			System.out.println("Body Color is: " +body);
		}
		System.out.println("Number of wheels are: " +wheels);

	}
}
