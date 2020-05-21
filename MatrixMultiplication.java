package com.sample;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= { {2 ,3 ,6 },{3, 5, 7} 
		
		             };

		int b[][]= { {3 ,2 },{4 ,5} ,{5 , 6 } };
		
		int result[][]=new int[2][2]; //resultant matrix size
		
		int sum=0;
		
		for(int i=0 ; i< 2 ;i++) {
			
			for(int j=0 ; j< 2 ;j++) {
				
				for(int k=0 ; k< 3 ;k++) {
					
					sum+=a[i][k] * b[k][j];
				}
				
				result[i][j]=sum;
				System.out.println(sum);
				sum=0;
			}
			
		}
		
		for(int[] i:result) {
			
			System.out.println(i[0] +" " +  i[1]);
		}
		
		
	}

}
