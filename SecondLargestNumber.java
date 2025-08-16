package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// Step 1: Declare the array
        Integer[] arr = {3, 2, 11, 4, 6, 7};
        
        // Step 2: Convert array to List
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        // Step 3: Sort in ascending order
        Collections.sort(list);
        
        // Step 4: Get second largest (second from last)
        int secondLargest = list.get(list.size() - 2);
        
        // Step 5: Print result
        System.out.println("Second largest number: " + secondLargest);
	}

}
