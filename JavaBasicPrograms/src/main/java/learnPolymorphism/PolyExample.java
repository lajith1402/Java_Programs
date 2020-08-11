package learnPolymorphism;

// example of overloading from other classes and inheritance other class
public class PolyExample extends learnOverLoadExample {
	
	//example of overloading - created 3 different classes and use them here
	// passing only one parameter, but with different value
	
	public void talk(ParentsOL styleoftalking) { // we can use/call other created class/data type
		System.out.println("Parents talking");
	}

	public void talk(ManagerOL style) { // Here 'ManagerOL' is being considered as a datatype (act like a wrapper class)
		System.out.println("Manager or boss talking");
		
	}
	
	public void talk(FriendOL style) {
		System.out.println("Friend or GF talking");
		
	}
	
	
	public static void main(String[] args) {
		PolyExample overload = new PolyExample();
		
		ParentsOL parents = new ParentsOL();
		overload.talk(parents);
		
		FriendOL frnd = new FriendOL();
		overload.talk(frnd);
		
		ManagerOL mgr = new ManagerOL();
		overload.talk(mgr);
		
		overload.add(10.5, 22.55); // inherited the methods from learnOverLoadExample.class
		overload.add(20, 30, 40); // inherited the methods from learnOverLoadExample.class
		overload.add(150, 250);
	}

}
