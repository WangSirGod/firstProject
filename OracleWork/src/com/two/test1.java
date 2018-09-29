package com.two;

import java.util.Random;

public class test1 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] a = new int[30];
		boolean key = false;
		for(int i = 0; i<a.length; i++){
			if(i ==0){
				a[0] = ran.nextInt(100);
			}else{
				a[i] = ran.nextInt(100);
				for(int j=0; j<i; j++){
					if(a[i]==a[j]){
						i--;
						continue;
					}else if(j==i-1){
						continue;
					}
				}
			}
		}
		//2 1 5 4 5
		//ÅÅÐò
		for(int i=0; i<a.length;i++){
			for(int j = 0; j<i; j++){
				if(a[j]<a[i]){
					int t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}
		}
		
		//´òÓ¡
		for(int i = 0; i<a.length;i++){
			System.out.print(a[i]+",");
		}
		
	}	
}