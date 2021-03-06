package com.SeleniumCucumber;

//import org.json.simple.parser.ParseException;
import java.nio.ReadOnlyBufferException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

//import junit.framework.Assert;
import org.junit.Assert;
//import static junit.framework.Assert.assertEquals;
//import static junit.framework.Assert.assertTrue;


import org.eclipse.jetty.util.thread.Timeout;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import com.Selenium.*;
import com.Selenium.SsJsonHandler;
import com.Selenium.User;
//import com.SeleniumCucumber;
import com.thoughtworks.selenium.Selenium;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.*;
import cucumber.api.java.en.*;



public class PeopleSearch {
	static String Name;
	private List<User> expectedResults = new ArrayList<User>();
	//static WebDriver driver;
	//static SsJsonHandler jh;
	
	@Before
	public void oneTimeSetUp() throws ParseException {
        // one-time initialization code 
		CukesRunner.driver = new FirefoxDriver();
		
    }//end oneTimeSetUp
	@After
	public void teardownall(){
		
		 
		CukesRunner.driver.close();
	}
	
	@Given("^user is on search page$")
	public void user_is_on_search_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		CukesRunner.driver.get(CukesRunner.jh.getURL());
	}

	@Given("^the following employees exist$")
	public void the_following_employees_exist(List<User> arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
		boolean check =false;
		Vector<User> tempResult;
		 //expectedResults = arg1.asList(User.class);
		 //throw new PendingException();
		System.out.println("this is the user coming from cucumber");
		//arg1.get(0).displayUserInfo();
		
		for(int i=0; i<arg1.size();++i){
			
			check = CukesRunner.dataBase.Search4User(arg1.get(i));
			if(check==true){
				System.out.println("User:"+arg1.get(i).getFirstName()+" "+arg1.get(i).getLasttName()+" was foud.");
			}
			else{
				System.out.println("User:"+arg1.get(i).getFirstName()+" "+arg1.get(i).getLasttName()+" was  not foud.");
				Assert.assertTrue("User "+arg1.get(i).getFirstName()+" "+arg1.get(i).getLasttName()+" not foud", check);
			}
		}
		
		
		
		/*
		for(int x =0; x < tempResult.size(); x++){
			
			System.out.print( (x+1)+" ");
			tempResult.get(x).displayUserInfo();
		}*/
		
	}// end Given

	@Given("^user enters \"([^\"]*)\" in search box$")
	public void user_enters_in_search_box(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		CukesRunner.driver.findElement(By.id("home_search_criteria")).sendKeys(arg1);
	}

	@When("^user submits search request$")
	public void user_submits_search_request() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		CukesRunner.driver.findElement(By.id("home-search-button")).click();
	}

	@Then("^the output should be$")
	public void the_output_should_be(List<User> arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // For automatic conversion, change DataTable to List<YourType>
		
		//arg1.get(0).displayUserInfo();
	    throw new PendingException();
	}
	

}// *************************** end class ***************************
