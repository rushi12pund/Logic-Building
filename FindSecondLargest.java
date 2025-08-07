package com.example.demo;

public class findSecondlargestnumber {

	public static void main(String[] args) {
		
		int arr[] = {1,5,6,7,3,6,5,4};

		int Fla = 0;
		int Sla = 1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] > Fla) {
				Fla = arr[i];
			}
	}
		
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j] > Sla && arr[j] < Fla) {
				
				Sla = arr[j];
				
				
			}
	}
		System.out.println("Second largest element is "+Sla);
		

	}

}
