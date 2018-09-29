package com.two;

import java.util.Random;

public class test2 {
	public static void main(String[] args) {
		int[] num =new int[30];
		Random ran = new Random();
		Array array = new Array();
		array.array(num);
		
		for(int i = 0; i<num.length;i++){
			System.out.print(num[i]+",");
		}
	
	}
	

}
