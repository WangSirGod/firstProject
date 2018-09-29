package edu.hbuas.cs.programlab.lab02;

public class Simulation {
	public static void main(String[] args){
		Station sta = new Station(15,1,1);  
		sta.setDAP();
		System.out.println(sta.money());
		
	}

}
