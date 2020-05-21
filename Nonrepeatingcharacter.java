package com.may19;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Nonrepeatingcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a program to find first non-repeating character from a input string*/
		Map<String,Integer> map=new LinkedHashMap<>();
		
		String input="aaBbcdefcdef";
		
		char[] iputCharArray=input.toCharArray();

		String key="";
		
		int value=0;
             		
		for(char c:iputCharArray) {
			
			key=String.valueOf(c);
			
			if(map.containsKey(key)) {
				value=map.get(key);
				map.put(key, value+1);
				
			}else {
				map.put(key, 1);
			}
		}
		
		String ch=map.entrySet().stream().filter(e->e.getValue() ==1).collect(Collectors.toList()).get(0).getKey();
		System.out.println(ch);
		
		/*for(Map.Entry<String, Integer> iter:map.entrySet()) {
			if(iter.getValue() == 1) {
				System.out.println(iter.getKey());
				break;
			}
			
		}*/
		
		
	}

}
