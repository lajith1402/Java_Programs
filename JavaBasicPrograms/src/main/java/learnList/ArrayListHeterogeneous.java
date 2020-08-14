package learnList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListHeterogeneous {

	public static void main(String[] args) {

		List al = new ArrayList(); // if we skip the generics name <String>, it is heterogeneous type and it accepts all data types.
		al.add(10);
		al.add("name");
		System.out.println(al);

	}

}
