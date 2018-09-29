package com.one;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入菱形行数:");
		int line = sc.nextInt();
		int k = 0,l = 0;
		for(int i = 1; i<=line;){
			if(i<=line/2){
				if(k<line/2-i+1){
					System.out.print(" ");
					k++;
				}else if(k>=line/2-i+1&&k<line/2+i){
					System.out.print("*");
					k++;
				}else{
					System.out.println("");
					k = 0;
					i++;				}
				
			}else{
				if(k<(i-(line/2+1))){
					System.out.print(" ");
					k++;
				}else if(k>=(i-(line/2+1))&&k<(line-i)*2+1 + (i-(line/2+1))){
					System.out.print("*");
					k++;
				}else{
					i++;
					System.out.println("");
					k = 0;
				}
			}
		}	
	}
}
  /*   *
      ***
     *****
    *******
     *****
      ***
       *    */