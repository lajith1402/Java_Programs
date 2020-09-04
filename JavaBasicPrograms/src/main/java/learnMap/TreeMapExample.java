package learnMap;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<String, String> places = new TreeMap<String, String>();
		places.put("Gopalapuram", "Chennai"); // key -- value pair combination data
		places.put("Guindy", "Chennai");
		places.put("Royapet", "Chennai");
		places.put("DMS", "Chennai");
		places.put("Chennai", "Tambaram");
		places.put("Chennai", "PVM");
		places.put(null, "Chennai"); // null pointer exception will be thrown during runtime
		
		System.out.println(places);		
		


	}

}
