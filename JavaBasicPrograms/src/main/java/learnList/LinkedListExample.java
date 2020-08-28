package learnList;

import java.util.LinkedList;

public class LinkedListExample {
	
	// LinkedList is good for Insertion and Deletion types
	// not good for search access as it does not implement 'RandomAccess' interface.
	
	public void linkedList() {
		
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		
		linkList.add(2);
		linkList.add(99);
		linkList.add(25);
		linkList.add(99);
		linkList.add(10);		
		System.out.println(linkList);
		
		linkList.addFirst(999);	
		System.out.println("Add First Value: " +linkList);
		
		linkList.addLast(1);
		System.out.println("Add at Last: " +linkList);
		
		System.out.println("get first Value: " +linkList.get(0)); //using index value
		System.out.println("get first Value: " +linkList.getFirst()); //using method
		
		linkList.remove(2); //2nd index value removed ("99")
		System.out.println(linkList);
		
		linkList.removeFirstOccurrence(2); // it will remove the first occurrence of the value starts from '9'
		System.out.println("**************************************");
		
		// using for-each loop method
		
		LinkedList<String> textList = new LinkedList<String>();
		textList.add("aaa");
		textList.add("bbb");
		textList.add("a12a");
		textList.add("dd334");
		System.out.println(textList);
		
		for(String value : textList) {
			System.out.println("The elements in linklist are: " +value);
		}
		
	}
	

	public static void main(String[] args) {
	
		LinkedListExample linkEg = new LinkedListExample();
		linkEg.linkedList();

	}

}
