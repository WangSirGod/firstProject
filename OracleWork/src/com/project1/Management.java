package com.project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Management {
	public static final String USERNAME = "admin", PASSWORD = "123456";

	public static void main(String[] args) throws AWTException {
		Scanner sc = new Scanner(System.in);
		String username;
		String password;
		String[] goodsname = new String[] { "��" };// ��Ʒ����
		double[] goodsprice = new double[] { 0 };// ��Ʒ�۸�
		String[] usersname = new String[] { "��" };// �û�����
		double[] usersprice = new double[] { 0 };// �û����
		boolean key = false;
		// ����Ա�ж�
		int x = 0;
		while (true) {
			System.out.println("���������Ա�˺�:");
			username = sc.next();
			System.out.println("���������Ա����:");
			password = sc.next();
			if(x<2){
				if (username.equals(USERNAME) && password.equals(PASSWORD)) {
					key = true;
					break;
				} else {
					System.err.println("�������,��������");
					x++;
					clear();
				}
			}else{
				System.err.println("����ʧ��,�Զ��˳�");
				clear();
				System.exit(0);
			}
			
		}
		
		while(key==true){
			clear();
			System.out.println("     ---1.��Ʒ����---");
			System.out.println("     ---2.�û�����---");
			System.out.println("     --- �˳� (-1)--");
			int i = sc.nextInt();
			if(i==1){
				clear();
				shop(key,goodsname,goodsprice);
			}else if(i == 2){
				clear();
				user(key,usersname,usersprice);
			}else if(i ==-1){
				key = false;
			}
		}
		
	

	}
	public static void shop(boolean key,String[]goodsname,double[]goodsprice) throws AWTException{
		Scanner sc = new Scanner(System.in);
		boolean key1 = true;
		while (key1) {
			System.out.println("     ---1.�����Ʒ---");
			System.out.println("     ---2.ɾ����Ʒ---");
			System.out.println("     ---3.�޸���Ʒ---");
			System.out.println("     ---4.�鿴��Ʒ---");
			System.out.println("     ---������һ��(0)-");
			System.out.println("     --- �˳�(-1)---");
			int t = sc.nextInt();
			switch (t) {
			case 1: {
				System.out.println("�����������Ʒ�����ƺͼ۸�:");
				// ��������
				String[] name = new String[goodsname.length + 1];
				name[name.length - 1] = sc.next();
				System.arraycopy(goodsname, 0, name, 0, goodsname.length);
				goodsname = name;
				// �۸�����
				double[] price = new double[goodsprice.length + 1];
				System.arraycopy(goodsprice, 0, price, 0, goodsprice.length);
				price[price.length - 1] = sc.nextInt();
				goodsprice = price;
				clear();
				break;
			}
			case 4: {
				for (int i = 1; i < goodsname.length; i++) {
					System.out.print("[" + goodsname[i] + ":" + goodsprice[i] + "] ");

				}
				System.out.println("������س������ϲ�˵�");
				int q = sc.nextInt();
				clear();
				break;
			}
			case 3: {
				if (goodsname.length > 1) {
					for (int i = 1; i < goodsname.length; i++) {
						System.out.print(i + ".[" + goodsname[i] + ":" + goodsprice[i] + "] ");
					}
					System.out.println("����Ҫ�޸ĵ���Ʒ�ı�ǩ,�����Լ��۸�");
					int i = sc.nextInt();
					goodsname[i] = sc.next();
					goodsprice[i] = sc.nextDouble();
					clear();
					break;
				} else {
					System.out.println("û���κ���Ʒ,��������س����ز˵�");
					String i = sc.next();
					clear();
					break;
				}
			}case 2: {
				if (goodsname.length > 1) {
					for (int i = 1; i < goodsname.length; i++) {
						System.out.print(i + ".[" + goodsname[i] + ":" + goodsprice[i] + "] ");
					}
					System.out.println(("����Ҫɾ����Ʒ�ı��"));
					int n = sc.nextInt();
					goodsname[n-1] = goodsname[goodsname.length-1];
					goodsname = Arrays.copyOf(goodsname, goodsname.length-1);
					goodsprice[n-1] = goodsprice[goodsprice.length-1];
					goodsprice = Arrays.copyOf(goodsprice, goodsprice.length-1);
					clear();
					break;
				} else {
					System.out.println("û���κ���Ʒ,��������س����ز˵�");
					String i = sc.next();
					clear();
					break;
				}
				

			}case 0:{
					key1 = false;
					break;
			}case -1 :{
					System.exit(0);
			}

			}
	
		}
	}
	
	public static void user(boolean key,String[]usersname,double[]usersprice) throws AWTException{
		Scanner sc = new Scanner(System.in);
		boolean key1 = true;
		while (key1) {
			System.out.println("     ---1.����û�---");
			System.out.println("     ---2.ɾ���û�---");
			System.out.println("     ---3.�޸��û�---");
			System.out.println("     ---4.�鿴�û�---");
			int t = sc.nextInt();
			switch (t) {
			case 1: {
				System.out.println("����������û����ƺ����:");
				// ��������
				String[] name = new String[usersname.length + 1];
				name[name.length - 1] = sc.next();
				System.arraycopy(usersname, 0, name, 0, usersname.length);
				usersname = name;
				// �۸�����
				double[] price = new double[usersprice.length + 1];
				System.arraycopy(usersprice, 0, price, 0, usersprice.length);
				price[price.length - 1] = sc.nextInt();
				usersprice = price;
				clear();
				break;
			}
			case 4: {
				for (int i = 1; i < usersname.length; i++) {
					System.out.print("[" + usersname[i] + ":" + usersprice[i] + "] ");

				}
				System.out.println("������س������ϲ�˵�");
				int q = sc.nextInt();
				clear();
				break;
			}
			case 3: {
				if (usersname.length > 1) {
					for (int i = 1; i < usersname.length; i++) {
						System.out.print(i + ".[" + usersname[i] + ":" + usersprice[i] + "] ");

					}
					System.out.println("����Ҫ�޸ĵ��û��ı��,�����Լ����");
					int i = sc.nextInt();
					usersname[i] = sc.next();
					usersprice[i] = sc.nextDouble();
					clear();
					break;
				} else {
					System.out.println("û���κ��û�,��������س����ز˵�");
					String i = sc.next();
					clear();
					break;
				}
			}case 2: {
				if (usersname.length > 1) {
					for (int i = 1; i < usersname.length; i++) {
						System.out.print(i + ".[" + usersname[i] + ":" + usersprice[i] + "] ");
					}
					System.out.println(("����Ҫɾ���û��ı��"));
					int n = sc.nextInt();
					usersname[n-1] = usersname[usersname.length-1];
					usersname = Arrays.copyOf(usersname, usersname.length-1);
					usersprice[n-1] = usersprice[usersprice.length-1];
					usersprice = Arrays.copyOf(usersprice, usersprice.length-1);
					clear();
					break;
				} else {
					System.out.println("û���κ��û�,��������س����ز˵�");
					String i = sc.next();
					clear();
					break;
				}

			}case 0:{
					key = false;
					break;
			}case -1 :{
				System.exit(0);
		}

			}
	
		}
	}

	// ����
	public static void clear() throws AWTException {
		Robot r = new Robot();
		r.delay(200);
		r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(200);
		
	}
}
