package javaCrashCourse;

public class ReturnData {

	int amount = 5000;
	int collect = 3500;
	
	/*public void collectAmount() {  // change void to return data type 
		System.out.println("Collect amount from the person: " +amount); */	
	
	// retunr value is nothing but collect the amount in one method, and hand it over the same value in other method
	
	public Integer collectAmount() {  // change void to return data type - we can use either int or Integer as return data type
		System.out.println("Collect amount from the person: " +amount);
		return amount;  // Add this statement if we need to return data
	}
	
	
	public void nonReturn() {
		System.out.println("collect amt:" +collect);
	}
	
	
	public static void main(String[] args) {
		ReturnData rd = new ReturnData();
		int returnedAmt = rd.collectAmount();		
		System.out.println("Returned Amount or data is: " +returnedAmt);
		
		rd.nonReturn(); //we cannot store this value in any int variable as it doesnot return the value, it throws error if we try to store it in int.
		
	}

}
