package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// Step 1: Create lists from the given arrays
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 2, 11, 4, 6, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 8, 4, 9, 7));
        
        // Step 2: Find intersection
        list1.retainAll(list2); // keeps only elements common to both
        
        // Step 3: Print the intersection
        System.out.println("Intersection: " + list1);
    }
	}


