package edu.hbuas.cs.programlab.lab01;

public class ComboLock {
	private static  int CODE1 ,CODE2 ,CODE3 ;//ËøÃÜÂë
	private static int  TRY;  //°µÂëÅÌ
	private int c1=-1,c2=-1,c3=-1; //Èı´Î³¢ÊÔÃÜÂë
	public ComboLock(int code1,int code2,int code3){
		CODE1 = code1;
		CODE2 = code2;
		CODE3 = code3;	
	}
	
	public void turnLeft(int ticks){
		for(int i =0; i<ticks; i++){
			if(TRY ==0)TRY =40;
			TRY--;
		}
		
		if(c1 == -1)c1 = TRY;
		else if(c2 == -1)c2 = TRY;
		else if(c3 == -1)c3 = TRY;
	}
	
	public void turnRight(int ticks){
		for(int i =0; i<ticks; i++){
			if(TRY ==39)TRY =-1;
			TRY++;
		}
		
		if(c1 == -1)c1 = TRY;
		else if(c2 == -1)c2 = TRY;
		else if(c3 == -1)c3 = TRY;
		
	}
	
	public boolean open(){
		if(CODE1 == c1&&CODE2 == c2&&CODE3 == c3)
			return true;
		else
			return false;	
	}
	
	
	
	//ÖØÖÃÃÜÂë
	public void reset(){
		TRY = 0;
	}
	

}
