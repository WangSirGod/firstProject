package com.two;

import java.util.Random;

public class Array {
	Random ran = new Random();

	public Array() {
		// TODO Auto-generated constructor stub
	}
	
	public void array(int[] a){
		for(int i = 0; i<a.length; i++){
			if(i ==0){
				a[0] = ran.nextInt(30);
			}else{
				a[i] = ran.nextInt(30);
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
		
	}


}
