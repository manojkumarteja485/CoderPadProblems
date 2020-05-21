package com.may18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*How to find pangram- they will giving you a string. logic is to find all the alphabets should be there in that string, 
		irrespective of lowercase or upper case If all are present then it is pangram*/
		Scanner in = new Scanner(System.in);
		System. out. println("Enter a string");
		String s = in. nextLine();
		
        s=s.toLowerCase().replace(" ", "");
        
		Set<String> stringSet=new HashSet<>();
		
		char charAray[]=s.toCharArray();
		
	
			for (char c : charAray) {
				
				if(String.valueOf(c).matches("^[a-zA-Z]*$")) {
				stringSet.add(String.valueOf(c));
				}
			}
			if (stringSet.size() == 26) {

				System.out.println("given string is panagram");
			} else {
				System.out.println("given string is not a panagram");
			} 
		
		
		
		
		
		
	}

}
