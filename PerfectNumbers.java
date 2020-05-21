package com.sample;

public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for(int n=1;n <100; n++){
			    int sum=0;
			    
			    for(int i=1; i<=100 ; i++){
			      
			      if(n >i && n % i== 0){
			        
			        sum+=i;
			    
			      }
			    }
			    
			    if(n == sum) {
			    System.out.println(sum);
			    } 
			
			    }

	}

}
