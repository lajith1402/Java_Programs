package learnList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> arraylist1 = new ArrayList<String>(); // using Dynamic Polymorphism

		arraylist1.add("honda");
		arraylist1.add("TATA");
		arraylist1.add("Swift");
		arraylist1.add("BMW");
		arraylist1.add("BMW");
		arraylist1.add("TATA");
		System.out.println("CAR list is: "+ arraylist1); // string values added in the insertion order & allowed duplicates

		System.out.println(arraylist1.get(2)); //get the index value of 2 - Swift
		System.out.println(arraylist1.indexOf("TATA")); //get the index value
		System.out.println(arraylist1.lastIndexOf("BMW")); //get the last index value of the string given

		List<String> anotherList = new ArrayList<String>();
		anotherList.addAll(arraylist1); // copy all values from Arraylist1 to anotherList
		System.out.println("Another list values are:" +anotherList);
		System.out.println("--------------------------------------------------");

		anotherList.clear();  // clearing all values in anotherList
		System.out.println(anotherList);

		arraylist1.remove(1); // remove the index value of 1 - TATA
		arraylist1.remove("BMW"); //remove the value from arraylist
		System.out.println(arraylist1);

		arraylist1.add(null); //arrayList accepts null insertion
		System.out.println(arraylist1);

		arraylist1.set(1, "SWIFT"); // use 'set' method to replace the value in the list
		System.out.println("The value replaced with swift in the list:" +arraylist1 );


		System.out.println(arraylist1.isEmpty()); // list is not empty hence false.


		// Iterate - Using Loops concept
		for (String value : arraylist1) {  //using 'for each' loop
			System.out.println("using for each loop: "+value);		
		}
		System.out.println("--------------------------------------------------");

		for (int i=0; i<arraylist1.size(); i++) {
			System.out.println("Using for loop only: "+arraylist1.get(i));
		}
		System.out.println("--------------------------------------------------");


		//using List Iterator -- ListIterator<String>  >>>> accepts forward and reverse direction allowed
		ListIterator<String> iterator1 = arraylist1.listIterator();
		while(iterator1.hasNext()) {  // fetching values in move forward direction
			System.out.println(iterator1.next());
		}
		System.out.println("--------------------------------------------------");
		
		while(iterator1.hasPrevious()) {
			System.out.println(iterator1.previous());
		}
		System.out.println("--------------------------------------------------");
		
		// Iterator -- only forward direction allowed
		Iterator<String> iterator2 = arraylist1.iterator();
		while(iterator2.hasNext()) {  // fetching values in move forward direction
			System.out.println(iterator2.next());
		}
		System.out.println("--------------------------------------------------");		
		

	}

}
