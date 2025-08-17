package com.example.demo.BitManipulation;

import java.util.Scanner;

public class HummingBit {
	
	public static void main(String[] arg) {
	
	Scanner Sc = new Scanner(System.in);
	
	System.out.println("enter the number");
    int n = Sc.nextInt();
    
    int count = 0;
    
    while(n > 0) {
    	
    	
    	if((n & 1) == 1) {
    		
    		count++;
    	}
    	
    	n = n >> 1;
    }
	

    
    System.out.println(count);
}
}
