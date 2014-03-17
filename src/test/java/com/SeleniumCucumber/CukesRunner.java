package com.SeleniumCucumber;

import java.text.ParseException;

import cucumber.api.java.Before;
import cucumber.api.junit.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Selenium.SsJsonHandler;
import com.Selenium.UserDataBase;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"pretty","html:target/cucumber","json-pretty:target/cucumber/cucumber-report.json"},
		features="src/test/resources"
		
		)


public class CukesRunner {
	static WebDriver driver;
	static SsJsonHandler jh;
	static UserDataBase dataBase;
	
	
	@BeforeClass
	public static void setUp() throws ParseException {
        // one-time initialization code 
		jh = new SsJsonHandler();
		jh.readJsonFile();	
		
		dataBase= new UserDataBase();
		dataBase.readCSVfile();
		
		
    }//end oneTimeSetUp
	
	
	@AfterClass
	public static void tearDown(){
		driver.close();
	}
}
