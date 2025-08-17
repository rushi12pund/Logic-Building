package com.example.demo.BitManipulation;

import java.util.Scanner;

public class EvenOddusingBit {

	public static void main(String[] args) {
	
		Scanner Sc = new Scanner(System.in);
		
		int n = Sc.nextInt();
		
		if((n&1) == 1) {
			System.out.println("odd");
			
		}else {
			System.out.println("even");
		}
	
	}

}
