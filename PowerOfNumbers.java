package com.may20;

import java.util.Scanner;

public class PowerOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* problem statement
		How to find is power of 10

		Ex:
		Input : 100 
		ouput: True (because 10 power 2 is 100)

		Input: 80
		Ouput: false (not power of 10)
		
*/		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		boolean flag=false;
		
		while(n !=1) {
			
			if(n % 10 == 0) {
				
				flag=true;
			}
			
			n=n/10;
		}
		
		if(flag) {
			
			System.out.println("Entered number is power of 10");
		}else {
			
			System.out.println("Entered number is not power of 10");
		}

	}

}
