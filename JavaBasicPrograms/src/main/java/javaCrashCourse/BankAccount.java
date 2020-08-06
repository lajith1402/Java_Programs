package javaCrashCourse;

public class BankAccount {

	Long bankAccNumber = 12345678904000l; //used Wrapper class (Long); declared value should be ended with alphabet 'l' to denote it as long datatype
	String holderName = "Ajit";
	int balanceAmt = 900; //used primitive data type (int), Here we can use the Wrapper class as 'Integer' as well


	public void getAccNumber() {
		System.out.println("Bank Acc # is: " + bankAccNumber);
	}


	public static void main(String[] args) {	
		BankAccount account = new BankAccount(); // creating object for class name, and to call other methods
		account.getAccNumber();
	}

}
