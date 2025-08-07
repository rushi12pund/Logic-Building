
package com.example.demo;

public class TwoSumBruteForce {

	public static void main(String[] args) {
	
		int arr[] = {2,4,5,6,4};
	
		int Targate = 6;
		
		
		for(int i=0;i<=arr.length;i++) {
			
			for(int j=i+1;j<=arr.length;j++) {
				
				if(arr[i]+arr[j] == Targate) {
					
					System.out.println(arr[i]+" "+arr[j]);
					
					break;
				}
				
				
			}
			
			break;
		}
	
	
	}

}
