package com.example.demo;

import java.util.Arrays;

public class MoveallZerosinRightSide {

public static void main(String[] args) {

int arr[] = {1,0,7,7,8,0,0,0,0,4};

int i = 0;

int j = 1;

for(int s=0;s<arr.length;s++) {
	
	if(arr[i]==0) {
	 i++;
	 
	 if( i >= arr.length) break;
	}
	
	if(arr[j] == 0) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		j++;
		if( j >= arr.length) break;
	}else {
		j++;
		if( j >= arr.length) break;
	}
	
}

System.out.println(Arrays.toString(arr));

}
}
