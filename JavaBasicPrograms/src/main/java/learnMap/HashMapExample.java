package learnMap;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> employees = new HashMap<Integer, String>();

		employees.put(101, "Rakesh");
		employees.put(102, "Ramu");
		employees.put(123, "Ajith");
		employees.put(101, "Charan");
		employees.put(null, "abcd");
		employees.put(145, "Charan");
		System.out.println("Employees details: " +employees);


		HashMap<Integer, String> duplicate = new HashMap<Integer, String>();
		duplicate.putAll(employees);
		System.out.println(duplicate);

		//clear all values in duplicate
		duplicate.clear();
		System.out.println(duplicate);

		// check if a key present
		System.out.println("Does it have 123 key? " +employees.containsKey(123));


		// check if a key present
		System.out.println("Does it have value Charan? " +employees.containsValue("Charan"));
		
		//clone the values
		System.out.println("clone the values:" +employees.clone());


	}

}
