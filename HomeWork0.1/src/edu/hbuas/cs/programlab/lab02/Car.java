package edu.hbuas.cs.programlab.lab02;

import java.util.Random;

public class Car {
	public static int INCOME = 0;//������
	private int driverNum  = 0 , station  ;//���������͵���վ̨
	Random ran = new Random();
	private final boolean direction = ran.nextBoolean();
	
	public Car(int first , Passenger p){
		this.station = first;
		System.out.println("���ӷ���"+direction);
		startTravel(p);
	}
	
	//�ж��Ƿ��ϳ�
	boolean getOn(Passenger p){
		if(p.Roule() == direction &&driverNum<3){
			driverNum++;
			return true;
		}else
			return false;
	}
	
	//�ж��³�
	boolean getOff(Passenger p){
		if(p.Last == station&&driverNum>0){
			return true;
		}	
		else
			return false;
	}
	//��ʼ��ʻ
	void startTravel(Passenger p){
		//������ʻ
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
