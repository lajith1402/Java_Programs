package learnFinalKeyword;

public class FinalKeywordExample {

	final String place = "Chennai";
	final int accNo = 4500;
	final String rollNo;	

	FinalKeywordExample() {  // initializing the final value in constructor 
	//	accNo = 3000;  // final variable should be initialized either in class level or in constructor, Not in methods
		rollNo = "abc123";
	} 

	public void findPlaces() {
		String place = "Madurai";
		System.out.println("New place name is: "+place);
	}

	public void accNumber() {
//		accNo = 500;  // cannot change or modify the final value
//		rollNo = "123edf";
		System.out.println(accNo);
		System.err.println(rollNo);
	}

	public static void main(String[] args) {
		
		FinalKeywordExample finalKey = new FinalKeywordExample();
		finalKey.findPlaces();
		finalKey.accNumber();
		


	}

}
