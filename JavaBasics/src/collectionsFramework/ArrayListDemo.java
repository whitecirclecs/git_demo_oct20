package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("New york");
		cities.add("Perth");
		
		Collections.sort(cities);
		
		for(String i : cities) {
			System.out.println(i);
		}
	
		
		System.out.println("Total elements in the list = " + cities.size());
		System.out.println("Is New Delhi present in the list = " + cities.contains("New Delhi"));
		System.out.println("Index of Paris = " + cities.indexOf("Paris"));
		System.out.println("Item stored at index 1 = " + cities.get(1));
		
		
		
		
		
	}

}
