import inheritanceExample.ParentCar;

public class ChildCar extends ParentCar {

	public static void main(String[] args) {
		
		ChildCar toy = new ChildCar();
		toy.drive();  // method name in parent class created in another package

	}

}
