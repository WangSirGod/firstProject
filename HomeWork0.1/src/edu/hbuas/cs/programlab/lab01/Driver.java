package edu.hbuas.cs.programlab.lab01;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		boolean is = false;
		if(is == false){
			System.out.println(123123);
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("������λ����:");
		ComboLock lock = new ComboLock(scan.nextInt(),scan.nextInt(),scan.nextInt());
		while(lock.open() == false){	
			System.out.print("������ת:");
			lock.turnRight(scan.nextInt());
			System.out.print("������ת:");
			lock.turnLeft(scan.nextInt());
			System.out.print("������ת:");
			lock.turnRight(scan.nextInt());
			
			if(lock.open() == false){
			System.out.println("�������,ת���Ѿ�����");
			lock.reset();
			}
		}
		
		System.out.println("�����ɹ�");
	}

}
