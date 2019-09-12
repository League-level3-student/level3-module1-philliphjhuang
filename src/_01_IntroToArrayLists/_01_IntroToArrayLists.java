package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> arr = new ArrayList<String>();
		//2. Add five Strings to your list
		arr.add("Hi");
		arr.add("Hello");
		arr.add("Hey");
		arr.add("Ho");
		arr.add("Hee");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0 ;i < arr.size();i++) {
			String s = arr.get(i);
			System.out.println(s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s : arr){
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int i = 0 ;i < arr.size();i+=2) {
			String s = arr.get(i);
			System.out.println(s);
		}
		//6. Print all the Strings in reverse order.
		for(int i = 0 ;i < arr.size();i++) {
			String s = arr.get(arr.size()-i-1);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0 ;i < arr.size();i++) {
			String s = arr.get(i);
			if(s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
