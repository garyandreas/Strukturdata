package pekan1;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] Args) {
		// size of the ArrayList
		int n = 5;
		// Declaring the ArrayList with initial size n
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		// Appending new elements at the end of the list
		for (int i = 1; i <= n; i++)
			arrli.add(i);
		// printing elements
		System.out.println(arrli);
		// Remove elements at index 3
		arrli.remove(3);
		// Displaying ArrayList
		// After deletion
		System.out.println(arrli);
		// Printing elements one by one
		for (int i = 0; i < arrli.size(); i++)
			System.out.print(i + " ");
		
		}
	}