package staticMethodTypes;

public class LearnStaticVariable {
	
	static int rows=50; // static variable name displays in italic font style
	static String name = "Name";
	int columns = 10;
	String table = "Table";
	
	public static void main(String[] args) {
		
		rows=75;
//		columns=20; // cannot call the non-static variable without object
		
		LearnStaticVariable object1 = new LearnStaticVariable();
		object1.rows=100; // creating object for 'static' variable is NOT necessary
		object1.columns=25;
		object1.table="Table1";
		name="Name1"; //defining value to the 'static' variable without using object
		
		LearnStaticVariable object2 = new LearnStaticVariable();
		rows=300; //defining value to the static variable without object
		object2.columns = 50;
		object2.name="Name2";
		object2.table="Table2";
		
		
		System.out.println("object1 rows:"+ object1.rows); //static variable is overridden by the final value and stored
		System.out.println("object1 columns:"+ object1.columns); // displays with normal given value
		System.out.println("object1 table:"+ object1.table);
		System.out.println("object1 name:"+ object1.name); // static variable overridden and displays final value in o/p
		
		
		System.out.println("object2 rows value is: "+object2.rows);
		System.out.println("object2 column value is: " +object2.columns);
		System.out.println("object2 name is: "+object2.name);
		System.out.println("object2 Table name is: "+object2.table);
		
	}

}
