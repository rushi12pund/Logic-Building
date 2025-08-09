package com.example.demo;

public class Avgofnumberinarray {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5};
		
		int avg = 0;
				
		for(int i=0; i<arr.length;i++) {
			
			avg += arr[i];
			
			
		}
		 avg = avg/arr.length;
		 
		 System.out.println("the average of the stream is " +avg);

	}

}
