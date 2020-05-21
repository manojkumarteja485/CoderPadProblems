package com.may18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PrimeFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Find Prime fraction of a number
		if no. Is 6 prime fraction is 2,3
		If no. Is 24 then prime fraction is 2,2,2,3
		If no. Is negative or 1 then there is no fraction it should be empty*/
		Scanner in = new Scanner(System.in);
		System. out. println("Enter a number");
		int number = in.nextInt();
        

	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	   }
		
	}


