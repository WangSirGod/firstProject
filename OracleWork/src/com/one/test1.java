package com.one;

public class test1 {
	public static void main(String[] args) {
		int sum = 2,k= 0;
		for(int i =2;i<=10000; i++){
			for(int j = 2;j<i;j++){
				if(i%j == 0)break;
				else k = j;
			}
			if(k==i-1){
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
 