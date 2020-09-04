package learnAbstract;


/*Refer the site for final keywords: https://beginnersbook.com/2014/07/final-keyword-java-final-variable-method-class/
*/
public class FinalExample {

	final String place = "Chennai";
	final int accNo;
	final String rollNo;	
	
	
	FinalExample(int aNum, String rNum) {  // initializing the final value in constructor by passing parameter variables
		accNo = aNum;
		rollNo = rNum;
	}
	
	
	void empData() {
		System.out.println("Acc number is: "+accNo);
		System.out.println("Emp roll number is: "+rollNo);
	}
	
	void myPlace() {
		System.out.println(place);
	}
	

	public static void main(String[] args) {
		FinalExample finalKey = new FinalExample(1234, "student1234");
		finalKey.empData();
		finalKey.myPlace();
		/*finalKey.findPlaces();
		finalKey.likePlace();*/		

	}
}
