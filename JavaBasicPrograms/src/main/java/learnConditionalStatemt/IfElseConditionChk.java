package learnConditionalStatemt;

public class IfElseConditionChk {

	boolean emptyCup;  // default value of boolean data type is 'false'

	public static void main(String[] args) {

		IfElseConditionChk cup = new IfElseConditionChk();

		if(cup.emptyCup == false) { // the value of '(cup.emptyCup)' is taken as true by default if we leave it as free/blank
			System.out.println("The cup is NOT Empty");
		}
		else {
			System.out.println("The cup is Empty");
		}

	}


}


