package learnString;

public class StringBufferExample {

	public static void main(String[] args) {
		
		System.out.println("String is IMMUTABLE");
		String name = "Ajith";
		System.out.println("Append a name to original : " +name.concat("kumar"));
		System.out.println("original name is: "+name);
		System.out.println("*****************************************************");
		
		System.out.println("StringBuffer is MUTABLE");
		StringBuffer name1 = new StringBuffer("Ajeeth");
		System.out.println("Append a name to original : " + name1.append("kumar"));
		System.out.println("original name is: "+ name1);

	// StringBuffer Methods
		//Reverse 
		System.out.println("Reversed Name is:" +name1.reverse()); // we can reverse name as StringBuffer is mutable, but not possible in String.
		 
		//Replace
		StringBuffer replaceName = new StringBuffer("charanjosh");
		System.out.println(replaceName.replace(1, 4, "Selvi")); //the new value is replaced (from index values) by 1 to 4 chars place & End index not added
		
		//delete
		StringBuffer delName = new StringBuffer("xxxxcharanjosh");
		System.out.println("Deleted Name is: "+ delName.delete(0, 4)); //chars from index value 0 to 3 are deleted in the string value
		
		//insert
		StringBuffer insertName = new StringBuffer("Ajeeth");
		System.out.println(insertName.insert(5,"kumar")); //this name 'kumar' is inserted at 5th index position of 'Ajeeth'; end index value is also displayed
		
		//capacity
		System.out.println(insertName.capacity());
		
// StringBuilder has charAt, SubString, length methods as same as in 'String' class.
		
		
		
		
	}

}
