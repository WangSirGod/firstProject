package com.one;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(),right = 10;;
		String n = num+"";
		boolean key = false;
		int[] t = new int[n.length()];
		
		for(int i = 0; i<n.length(); i++){
			t[i] = num%right;
			num = num/10;
		}
		
		for(int i = 0; i<t.length/2; i++){
			if(t[i] == t[t.length-i-1])key = true;
			else key = false;
		}
		
		System.out.println(key);
		
	}
}
		
