package com.example.demo;

public class EvenOddCount {
	
	public static void main (String []args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,0};
		int count = 0;
		int count2 =0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] % 2 == 0) {
				count++;
			}else {
				count2++;
			}
			
			
		}
		System.out.println("even number count is "+count);
		
		
		
		System.out.println("Odd number count is "+count2);
		
		
		
	}
	
	
	
	
	

}
