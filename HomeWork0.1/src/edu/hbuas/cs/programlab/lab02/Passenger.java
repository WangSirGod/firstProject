package edu.hbuas.cs.programlab.lab02;

import java.util.Random;

//乘客
public class Passenger {
	Random ran = new Random();
	public int First,Last;
	private int Pay = 0; //起始地和目的地
	
	public Passenger(int first){
		First = first;
		Last = ran.nextInt(29);
		System.out.println(Last);
		Pay = Math.abs(Last - first);
		
	}
	
	
	//判断路程方向
	public boolean Roule(){
		if(Last>First)return true;
		else return false;
	}
	
	public int getPay(){
		return Pay;
	}
	

}
