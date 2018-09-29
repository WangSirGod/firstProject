package edu.hbuas.cs.programlab.lab02;
//初始站台
public class Station {
	private int Number,Driver,Passenger,Money=0; //站台编号  0-29 ,司机数,乘客数.
	Passenger[] passenger; //存放乘客
	Car[] car ; //存放司机 
	public Station(int num,int driver, int passenger){
		Number = num;
		Driver = driver;
		Passenger = passenger;
		this.car = new Car[driver];
		this.passenger = new Passenger[passenger];
		
	}
	
	void setDAP(){
		for(int i = 0; i<Driver; i++){
			for(int j = 0; j<Passenger; j++){
				car[i] = new Car(Number,this.passenger[j] = new Passenger(Number));
			}
			Money =car[i].INCOME;
		}
		
	}
	
	public int money(){
		return Money;
	}
}
