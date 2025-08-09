package com.example.demo;

public class findfirstlargestelementinarray {

	public static void main(String[] args) {

		int arr[] = {1,9,2,4,5,6,10};
		
		int temp =0;
		
		for (int i=0;i<arr.length;i++) {
			
			if(arr[i]>temp) {
				temp = arr[i];
			}
		}
System.out.println("largest number is temp " +temp);

	}

}
