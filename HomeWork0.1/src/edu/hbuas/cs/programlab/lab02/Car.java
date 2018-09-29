package edu.hbuas.cs.programlab.lab02;

import java.util.Random;

public class Car {
	public static int INCOME = 0;//总收入
	private int driverNum  = 0 , station  ;//车内人数和到达站台
	Random ran = new Random();
	private final boolean direction = ran.nextBoolean();
	
	public Car(int first , Passenger p){
		this.station = first;
		System.out.println("车子方向"+direction);
		startTravel(p);
	}
	
	//判断是否上车
	boolean getOn(Passenger p){
		if(p.Roule() == direction &&driverNum<3){
			driverNum++;
			return true;
		}else
			return false;
	}
	
	//判断下车
	boolean getOff(Passenger p){
		if(p.Last == station&&driverNum>0){
			return true;
		}	
		else
			return false;
	}
	//开始行驶
	void startTravel(Passenger p){
		//向右行驶
		while(direction == p.Roule() ==true){
			if(p.Last == station){
				driverNum--;
				INCOME +=p.getPay();
				break;
			}
			station++;
		}
		
		while(direction == p.Roule()==false){
			if(p.Last == station){
				driverNum--;
				INCOME +=p.getPay();
				break;
			}
			if(station>0)station--;
		}
		
		
		
	}
}
