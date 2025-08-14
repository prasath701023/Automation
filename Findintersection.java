package Week4day1;

import java.util.ArrayList;
import java.util.List;

public class Findintersection{

	public static void main(String[] args) {
		
		// Declare an array
		int array1 [] = {3, 2, 11, 4, 6, 7};
        int array2 [] =  {1, 2, 8, 4, 9, 7};
        
	
	    //convert to arrays list
	    List<Integer> list1 = new ArrayList<>(); 
	    List<Integer> list2 = new ArrayList<>();
	    

		for (int num1 : array1) {
		    list1.add(num1);
		}
		for (int num : array2) {
			list2.add(num);
		}

		System.out.println("common numbers");
		for (Integer num : list1) {
			if (list2.contains(num)) {
				System.out.println(num);
			}
		}
	
	}
}
		
		
		
		
		
