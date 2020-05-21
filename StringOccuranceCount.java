package com.may15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringOccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*"Question: given a string such as ""aabbbbbcc"" print the "
				+ "longest occurring character,index and number of times like ""longest occurring character is b and length is 5 at index 2"".
*/		Scanner in = new Scanner(System.in);
		System. out. println("Enter a string");
		String s = in. nextLine();
	
		
		
		Map<String,List<Integer>> map=new HashMap<>();
		int count=0;
		
		if(!s.isEmpty() && s!=null && s != "") {
			int index = 0;
		char[] charArray=s.toCharArray();
		
		for(char c:charArray) {
			index++;
			
			if(map.containsKey(String.valueOf(c))){
				List<Integer> UpdatedlistInteger=new ArrayList<>();
				UpdatedlistInteger=map.get(String.valueOf(c));
				count=UpdatedlistInteger.get(0) + 1;
				UpdatedlistInteger.add(0, count);
				map.put(String.valueOf(c),UpdatedlistInteger);
				
			}else {
				List<Integer> listInteger=new ArrayList<>();
				listInteger.add(1); //for count
				listInteger.add(index-1); //for index
				map.put(String.valueOf(c),listInteger) ;
			}
		}
		
		
		}
		
		for(Entry<String, List<Integer>> repeat:map.entrySet()) {
			
			System.out.println(repeat.getKey() + " " +repeat.getValue().get(0) + " " +repeat.getValue().get(2));
			
		}
		
		

	}

}
