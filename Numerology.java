package com.may19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Numerology {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Find out the numerology number for the given name as mentioned below:

			Each alphabet represented with one number as given : 
			A,I,J,Q,Y - 1
			B,K,R-2
			C,G,L,S - 3
			D,M,T - 4
			E,H,N,X -5
			U,V,W-6
			O,Z-7
			F-P-8

			If input String is ""S. KANAPATHY"" then output should be 4.
			Ex:
			S. KANAPATHY ==> 3+2+1+5+1+8+1+4+5+1=31 (3+1) = 4*/
		Map<List<String>,Integer> map=new HashMap<>();
		
		String array1[]= {"A","I","J","Q","Y"};
		String array2[]= {"B","K","R"};
		String array3[]= {"C","G","L","S"};
		String array4[]= {"D","M","T"};
		String array5[]= {"E","H","N","X"};
		String array6[]= {"U","V","W"};
		String array7[]= {"O","Z"};
		String array8[]= {"F","P"};
		
		
		//System.out.println("hi manoj");
		map.put(Arrays.asList(array1).parallelStream().collect(Collectors.toList()), 1);
		map.put(Arrays.asList(array2).parallelStream().collect(Collectors.toList()), 2);
		map.put(Arrays.asList(array3).parallelStream().collect(Collectors.toList()), 3);
		map.put(Arrays.asList(array4).parallelStream().collect(Collectors.toList()), 4);
		map.put(Arrays.asList(array5).parallelStream().collect(Collectors.toList()), 5);
		map.put(Arrays.asList(array6).parallelStream().collect(Collectors.toList()), 6);
		map.put(Arrays.asList(array7).parallelStream().collect(Collectors.toList()), 7);
		map.put(Arrays.asList(array8).parallelStream().collect(Collectors.toList()), 8);
		
		String givenInput="S. KANAPATHY";
		
		char[] stringArray=givenInput.toCharArray();
		
		int sum=0;
		for(char c:stringArray) {
			
			if(String.valueOf(c).matches("^[a-zA-Z]*$")) {
				
				int j=map.entrySet().stream().filter(e -> e.getKey().contains(String.valueOf(c))).collect(Collectors.toList()).get(0).getValue();
				
				sum+=j;
				
				
			}
			
		}
		
		System.out.println(sum);
		
		if(sum > 10) {
			
			String array[]=String.valueOf(sum).split("");
			
			System.out.print("the result is ");
			System.out.println( Integer.valueOf(array[0]) +Integer.valueOf(array[1]));
		}
		

	}

}
