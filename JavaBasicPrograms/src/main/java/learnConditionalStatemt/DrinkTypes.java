package learnConditionalStatemt;

public class DrinkTypes {
	
	String myDrink = "Milk";
	
	public void favDrink() {
		if (myDrink.equals("Coffee")) {
			System.out.println("Coffee is my drink");
		}
		else if (myDrink.equals("Boost")) {
			System.out.println("Boost is my drink");
		}
		
		else if (myDrink.equals("Milk")) {
			System.out.println("Milk is my drink");
		}
		
		else {
			System.out.println("Tea is my Drink");
		}
		
	}
	

	public static void main(String[] args) {
		DrinkTypes drink = new DrinkTypes();
		drink.favDrink();

	}

}
