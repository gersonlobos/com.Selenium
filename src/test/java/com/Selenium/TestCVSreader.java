package com.Selenium;

import java.util.Vector;

public class TestCVSreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDataBase dataBase= new UserDataBase();
		
		Vector<User> temp;
		
		dataBase.readCSVfile();
	
		temp = dataBase.Search4String("Allen");
		
		for(int x =0; x < temp.size(); x++){
			
			System.out.print( (x+1)+" ");
			temp.get(x).displayUserInfo();
		}

	}

}
