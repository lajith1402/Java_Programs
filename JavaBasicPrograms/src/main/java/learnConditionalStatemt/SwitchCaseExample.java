package learnConditionalStatemt;

public class SwitchCaseExample {

	String myHero = "Bat Man";

	public void checkmyHero() {

		switch (myHero) {
		case "Iron Man":
			System.out.println("My hero is Iron Man");
			break;  // If we dont give break; command, all other following cases will also get executed without checking the conditions

		case "Super Man":
			System.out.println("My hero is Super Man");
			break;

		case "Junk Man":
			System.out.println("My hero is Junk Man");
			break;

		default:
			System.out.println("My hero is Bat Man");

		}		

	}

	public static void main(String[] args) {

		SwitchCaseExample hero = new SwitchCaseExample();
		hero.checkmyHero();


	}

}
