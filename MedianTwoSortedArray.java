package com.may20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* problem statemnt
		Find the median of two sorted arrays of different size. 

		Example:
		 Input : 
		Array 1: 2 3 6 7 9 
		Array 2: -1 4 8 10  = 5 

		Output : 6

		Hint: The final sorted array would be - 1, 2, 3, 4, 6, 7, 8, 9, 10 The 5th element of this array is 6.*/
    
		Integer array[]= {2 ,3, 6, 7 ,9};
		
		Integer array1[]= {-1 ,4, 8 ,10};
		
		List<Integer> listInteger=new ArrayList<>();
		
		listInteger.addAll(Arrays.asList(array));
		
		listInteger.addAll(Arrays.asList(array1));
		
		Collections.sort(listInteger);
		
		int size=listInteger.size();
		
		System.out.println(listInteger.get((size/2)));
		
	}

}
