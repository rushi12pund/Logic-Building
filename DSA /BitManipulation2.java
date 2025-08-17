package com.example.demo.BitManipulation;

public class setbit {

	public static void main(String[] args) {

		int n =6;  // 1000
		int pos =1;   //0010   0100        1100
		
		int bitMask = 1<<pos;
		
		int newNumber = bitMask | n;
		
		System.out.println(newNumber);
		
	}

}
