package edu.hbuas.cs.programlab.lab02;
//��ʼվ̨
public class Station {
	private int Number,Driver,Passenger,Money=0; //վ̨���  0-29 ,˾����,�˿���.
	Passenger[] passenger; //��ų˿�
	Car[] car ; //���˾�� 
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
