package com.Selenium;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class UserDataBase {
	
	  private Vector<User> listUsers= new Vector<User>();

	
	public void readCSVfile(){
		
		
		   String csvFileToRead = "employee1.csv";  
		   BufferedReader br = null;  
		   String line = "";  
		   String splitBy = ",";  //to separate them by commas.
		   //String splitBy2 = "\\s";  //to separate them by space. 
		   int counter=1;
		  
		   try {  
		  
		   br = new BufferedReader(new FileReader(csvFileToRead));  
		   while ((line = br.readLine()) != null) {  
		
			//System.out.println(line);
		     
		     String[] result = line.split(splitBy);
		     //for displaying every single token in the line
		    // for (int x=0; x<result.length; x++)
		      //   System.out.println(result[x]);
		     
		 //getting data and creating an object and inserting it into the list.		    

		    listUsers.add(new User(result[0],result[1],result[2],result[3],result[4]));
		    
		    //displaying the result with its proper name.	
		   // System.out.println("User"+(counter++)+" [name= " + result[0] + " , last="  
		   //   + result[1] + " , email=" + result[2] + " , PhoneNumber="  
		   //   + result[3] + " , Department=" + result[4] + "]");  
		    
		    
		   }  
		  } catch (FileNotFoundException e) {  
		  e.printStackTrace();  
		  } catch (IOException e) {  
		   e.printStackTrace();  
		  } finally {  
		   if (br != null) {  
		    try {  
		     br.close();  // closing the buffer reader.
		    } catch (IOException e) {  
		     e.printStackTrace();  
		    }  
		   }  
		  }  
		  
		  //System.out.println("Done with reading CSV");  
		
	}//end read csv
	
	public void display_database(){
		int counter=0;
		
		while(counter<listUsers.size()){
		  //displaying the result with its proper name.	
		    System.out.println("User"+(counter+1)+" [name= " + listUsers.get(counter).getFirstName() + " , last="  
		      + listUsers.get(counter).getLasttName() + " , email=" + listUsers.get(counter).getEmail() + " , PhoneNumber="  
		      + listUsers.get(counter).getPhoneNumber() + " , Department=" + listUsers.get(counter).getDepartment() + "]"); 
		    counter++;
		}
	
	}//end display data
	
	public Vector<User> Search4String(String str){
	
		Vector<User> tempVector = new Vector<User>();
		boolean isInserted= false;
		
		for(int x = 0 ; x < listUsers.size(); x++){
					
				if( (listUsers.get(x).getFirstName()).startsWith(str)  ){
					tempVector.add(listUsers.get(x));
					isInserted=true;
				}
				if( (listUsers.get(x).getLasttName()).startsWith(str) && isInserted==false ){
					tempVector.add(listUsers.get(x));
				}
				if( (listUsers.get(x).getEmail()).startsWith(str) && isInserted==false ){
					tempVector.add(listUsers.get(x));
				}
				if( (listUsers.get(x).getPhoneNumber()).startsWith(str) && isInserted==false ){
					tempVector.add(listUsers.get(x));
				}
				if( (listUsers.get(x).getDepartment()).startsWith(str) && isInserted==false ){
					tempVector.add(listUsers.get(x));
				}
				
		}//end for loop
		return tempVector; //the vector 
	}
	
	
	
	
	
	
}//end class 
