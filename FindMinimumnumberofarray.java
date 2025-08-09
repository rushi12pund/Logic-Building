package com.example.demo;

public class FindMinimumNumberofarray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		int max = 0 ;
		int min = 0 ;
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i] > max ) {
				max = arr[i];
			}
			
		}
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i] < max  ) {
				
				min = arr[i];
				
			}
			
		}
		System.out.println("minimum element is "+min);
		
	}

}
