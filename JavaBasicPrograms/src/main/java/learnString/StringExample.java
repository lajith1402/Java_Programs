package learnString;

public class StringExample {

	public static void main(String[] args) {
		String name = "Ajeethkumar"; //string literal
		int num = 5;
		
		// returns char value for the particular index
		System.out.println(name.charAt(1)); //o/p value is 'j'
		
		// returns string length
		System.out.println(name.length());
		
		//compare the input with the given string value
		System.out.println(name.equals("Ajeeth"));
		
		//compare with input and ignore the case sensitive
		System.out.println(name.equalsIgnoreCase("AJEETH KUMAR"));
		
		//check if string is empty or not
		System.out.println(name.isEmpty());
		
		//returns true or false based on the input given is present in the string
		System.out.println(name.contains("j"));
		
		// take a particular portion of the string using 'begin index' and 'end index'
		System.out.println(name.substring(2)); // the value starts with begin index value; o/p - 'eethkumar' 
		System.out.println(name.substring(1, 5)); // o/p is 'jeet' - end index value is not added 
		
		//appends the value to the given string
	    System.out.println(name.concat(" charan"));
	    
	    //replace char(s) in the string
		System.out.println(name.replace("e", "z")); // char z is replaced for e in the name
		System.out.println(name.replace("kumar", "king")); //kumar is replaced with a new value 
		
		//find the position of a char in the given string
		System.out.println(name.indexOf("e")); //it will show the index value of first occurrence of char 'e' = 2
		
		//find the index position of a char after the specified char
		System.out.println(name.indexOf("k", 4)); //op = 6
		System.out.println(name.indexOf("t", 5));  // op -1
		System.err.println(name.indexOf("kum", 4));
		
		// trim the string value
		System.out.println(name.trim());
		
		//convert the given data type from int to string
		System.out.println(String.valueOf(num)); // the int value is converted into String data type
		
		//convert from uppercase to lowercase
		String uppercase = "AJEETH";
		System.out.println(uppercase.toLowerCase());
		
		//convert from lowercase to uppercase
		String lowercase = "kumar";
		System.out.println(lowercase.toUpperCase());
		
		//returns the output with a delimiter symbol - add delimiter in between the values
		System.out.println(String.join("|", "learn", "auto", "online")); //op is = learn|auto|online
		System.out.println(String.join("/", "14","08","2020")); //op is 14/08/2020
		System.out.println(String.join("&&", "aji", "kumar")); //aji&&kumar
		
		//split the sentence by unique char
		String splitSent = "I,am, a, good,boy!";
		String[] splittedWords = splitSent.split(",");
		for (String eachWord : splittedWords) {
			System.out.println(eachWord);			
		}
		

	}

}
