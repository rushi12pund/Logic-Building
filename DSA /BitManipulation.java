package com.example.demo.BitManipulation;

import java.util.*;
public class updatebitbypos1 {
	
	public static void main(String args[]) {
		
		
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Tell me The Operation between 0 to 1");
		
		int oper = Sc.nextInt();
		
		int n = 5;
		
		int pos = 1;
		
		int bitMask = 1<<pos;
		
		
		if(oper == 1) {
			
			int newbitmask = bitMask | n;
			
			System.out.println(newbitmask);
			
		}else {
			
			int newbitMask = ~(bitMask);
			
			int num = newbitMask & n;
			
			System.out.println(num);
		}
		
		
		
	}

}
