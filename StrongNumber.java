package com.sample;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static int mul=1;
		int n=145;
		
		String number=String.valueOf(n);
		
		char arrray[]=number.toCharArray();
		
		int sum=0;
		for(char c:arrray) {
			
			//System.out.println(Integer.parseInt(String.valueOf(c)));
			sum+=getFactorialOfgivennumber(Integer.parseInt(String.valueOf(c)));
			
		}
		
		if(sum == n) {
			//System.out.println(sum);
			System.out.println("given number is strong number");
		}
	}

	private static int getFactorialOfgivennumber(Integer integer) {
		// TODO Auto-generated method stub
		
		//int mul=1;
		if(integer == 0) {
			
			return 1 ;
		}else {
			
			return integer *getFactorialOfgivennumber(integer -1);
		}
		
		
	}

}
