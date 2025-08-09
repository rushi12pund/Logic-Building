package com.example.demo;

public class Checkifthearrayissortedofnot {

	public static void main(String[] args) {
		
		int arr[] = {1,4,6,9,7,6};
	    
		boolean v = true;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>arr[i+1]) {
				
				v= false;
				break;
				
			
			
			}
			
	}
		
		if(v == true ) {
			System.out.println("array is sorted ");
		}
		else {
			System.out.println("array is unsorted");
		}
		
		
	}
	
	
	
	
}
