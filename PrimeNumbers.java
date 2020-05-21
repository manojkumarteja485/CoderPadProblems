package com.may15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	/*	If input is 6, output should be 2,3
		For input 5, output should be 5 (for all prime numbers the output should be the same)*/
		
		Scanner in = new Scanner(System. in);
		System. out. println("Enter a number");
		int n = in. nextInt();
		boolean flag=false;
		
		for(int i=2; i < n/2  ; i++) {
			if(n % i == 0) {
				
				flag=true;
				
				break;
			}
			
		}
		
		if(flag) {
			
			pintingPrimeNumbers(n);
		}else {
			
			System.out.println("given number is prime number");
		}
		

	}

	private static void pintingPrimeNumbers(int num) {
		// TODO Auto-generated method stub
		
		//String primeNumbers="";
		int count=0;
		for(int i = 1 ; i <= num ; i++)
		{
			//logic for checking number is prime or not
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}

}
}
