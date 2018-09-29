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
		String[] goodsname = new String[] { "空" };// 商品名称
		double[] goodsprice = new double[] { 0 };// 商品价格
		String[] usersname = new String[] { "空" };// 用户名称
		double[] usersprice = new double[] { 0 };// 用户余额
		boolean key = false;
		// 管理员判断
		int x = 0;
		while (true) {
			System.out.println("请输入管理员账号:");
			username = sc.next();
			System.out.println("请输入管理员密码:");
			password = sc.next();
			if(x<2){
				if (username.equals(USERNAME) && password.equals(PASSWORD)) {
					key = true;
					break;
				} else {
					System.err.println("密码错误,重新输入");
					x++;
					clear();
				}
			}else{
				System.err.println("三次失败,自动退出");
				clear();
				System.exit(0);
			}
			
		}
		
		while(key==true){
			clear();
			System.out.println("     ---1.商品管理---");
			System.out.println("     ---2.用户管理---");
			System.out.println("     --- 退出 (-1)--");
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
			System.out.println("     ---1.添加商品---");
			System.out.println("     ---2.删除商品---");
			System.out.println("     ---3.修改商品---");
			System.out.println("     ---4.查看商品---");
			System.out.println("     ---返回上一层(0)-");
			System.out.println("     --- 退出(-1)---");
			int t = sc.nextInt();
			switch (t) {
			case 1: {
				System.out.println("请输入添加商品的名称和价格:");
				// 名称扩充
				String[] name = new String[goodsname.length + 1];
				name[name.length - 1] = sc.next();
				System.arraycopy(goodsname, 0, name, 0, goodsname.length);
				goodsname = name;
				// 价格扩充
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
				System.out.println("任意键回车返回上层菜单");
				int q = sc.nextInt();
				clear();
				break;
			}
			case 3: {
				if (goodsname.length > 1) {
					for (int i = 1; i < goodsname.length; i++) {
						System.out.print(i + ".[" + goodsname[i] + ":" + goodsprice[i] + "] ");
					}
					System.out.println("输入要修改的商品的标签,名称以及价格");
					int i = sc.nextInt();
					goodsname[i] = sc.next();
					goodsprice[i] = sc.nextDouble();
					clear();
					break;
				} else {
					System.out.println("没有任何商品,按任意键回车返回菜单");
					String i = sc.next();
					clear();
					break;
				}
			}case 2: {
				if (goodsname.length > 1) {
					for (int i = 1; i < goodsname.length; i++) {
						System.out.print(i + ".[" + goodsname[i] + ":" + goodsprice[i] + "] ");
					}
					System.out.println(("输入要删除商品的编号"));
					int n = sc.nextInt();
					goodsname[n-1] = goodsname[goodsname.length-1];
					goodsname = Arrays.copyOf(goodsname, goodsname.length-1);
					goodsprice[n-1] = goodsprice[goodsprice.length-1];
					goodsprice = Arrays.copyOf(goodsprice, goodsprice.length-1);
					clear();
					break;
				} else {
					System.out.println("没有任何商品,按任意键回车返回菜单");
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
			System.out.println("     ---1.添加用户---");
			System.out.println("     ---2.删除用户---");
			System.out.println("     ---3.修改用户---");
			System.out.println("     ---4.查看用户---");
			int t = sc.nextInt();
			switch (t) {
			case 1: {
				System.out.println("请输入添加用户名称和余额:");
				// 名称扩充
				String[] name = new String[usersname.length + 1];
				name[name.length - 1] = sc.next();
				System.arraycopy(usersname, 0, name, 0, usersname.length);
				usersname = name;
				// 价格扩充
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
				System.out.println("任意键回车返回上层菜单");
				int q = sc.nextInt();
				clear();
				break;
			}
			case 3: {
				if (usersname.length > 1) {
					for (int i = 1; i < usersname.length; i++) {
						System.out.print(i + ".[" + usersname[i] + ":" + usersprice[i] + "] ");

					}
					System.out.println("输入要修改的用户的编号,名称以及余额");
					int i = sc.nextInt();
					usersname[i] = sc.next();
					usersprice[i] = sc.nextDouble();
					clear();
					break;
				} else {
					System.out.println("没有任何用户,按任意键回车返回菜单");
					String i = sc.next();
					clear();
					break;
				}
			}case 2: {
				if (usersname.length > 1) {
					for (int i = 1; i < usersname.length; i++) {
						System.out.print(i + ".[" + usersname[i] + ":" + usersprice[i] + "] ");
					}
					System.out.println(("输入要删除用户的编号"));
					int n = sc.nextInt();
					usersname[n-1] = usersname[usersname.length-1];
					usersname = Arrays.copyOf(usersname, usersname.length-1);
					usersprice[n-1] = usersprice[usersprice.length-1];
					usersprice = Arrays.copyOf(usersprice, usersprice.length-1);
					clear();
					break;
				} else {
					System.out.println("没有任何用户,按任意键回车返回菜单");
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

	// 清屏
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
