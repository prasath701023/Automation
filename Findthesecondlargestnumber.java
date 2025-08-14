package Week4day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Findthesecondlargestnumber {

	public static void main(String[] args) {
		 
		//Create in array 
		int[] numbers = {3, 2, 11, 4, 6, 7};
		
		//Convert array to List
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
	}
		 //Sort the list in Ascending order
        Collections.sort(numberList);  
        
        //Get the second last element
        int secondLargest = numberList.get(numberList.size() - 2);
        
        
        //Print the result
        System.out.println("Second largest number is: " + secondLargest);
	}
	

}
