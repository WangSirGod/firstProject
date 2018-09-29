package edu.hbuas.cs.programlab.lab01;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		boolean is = false;
		if(is == false){
			System.out.println(123123);
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("设置三位密码:");
		ComboLock lock = new ComboLock(scan.nextInt(),scan.nextInt(),scan.nextInt());
		while(lock.open() == false){	
			System.out.print("向右旋转:");
			lock.turnRight(scan.nextInt());
			System.out.print("向左旋转:");
			lock.turnLeft(scan.nextInt());
			System.out.print("向右旋转:");
			lock.turnRight(scan.nextInt());
			
			if(lock.open() == false){
			System.out.println("密码错误,转盘已经归零");
			lock.reset();
			}
		}
		
		System.out.println("开锁成功");
	}

}
