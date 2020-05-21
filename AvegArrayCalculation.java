package com.may18;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class AvegArrayCalculation {

	public static void main(String[] args) {
		
		/*"Input Array 
		[{""Abc"",""80""},{""Xyz"",""60""}, {""Pqr"",""65""},{""Abc"",""86""}
		Return the highest average mark obtained by a student. If average mark has floating point, take the floor. Here output will be 83.
		A student can take the test any number of times*/
		
		String array[][]={{"Abc","80"},{"Xyz","60"}, {"Pqr","65"},{"Abc","86"}};
		
		Map<String,Integer> map=new HashMap<>();
		String key="";
		int value=0;
		for(String[] m:array) {
			
			key=m[0];
			value=Integer.valueOf(m[1]);
			
			if(map.containsKey(key)){
				
				int mapValue=map.get(key);
				
				map.put(key, (mapValue+value)/2);
			}else {
				
				map.put(key, value);
			}
			
			
		}
		
		
		
		int max=Collections.max(map.values());
		
           for(Entry<String, Integer> entryset:map.entrySet()) {
			
        	   if(entryset.getValue() ==max)
			System.out.println(entryset.getKey() + " "+entryset.getValue());
			
		}
	}
		
	}


