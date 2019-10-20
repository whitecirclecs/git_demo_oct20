package collectionsFramework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		LinkedList<String> cities = new LinkedList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("New york");
		cities.add("Perth");
		cities.add("London");
		
		Collections.sort(cities);
		
		for(String t : cities) {
			System.out.println(t);
		}
	
		
		System.out.println("Total elements in the list = " + cities.size());
		System.out.println("Is New Delhi present in the list = " + cities.contains("New Delhi"));
		System.out.println("Index of Paris = " + cities.indexOf("Paris"));
		System.out.println("Item stored at index 1 = " + cities.get(1));
		
	}

}
