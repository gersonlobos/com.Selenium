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

@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"pretty","html:target/cucumber","json-pretty:target/cucumber/cucumber-report.json"},
		features="src/test/resources"
		)


public class CukesRunner {
	static WebDriver driver;
	static SsJsonHandler jh;
	
	
	@BeforeClass
	public static void setUp() throws ParseException {
        // one-time initialization code 
		jh = new SsJsonHandler();
		jh.readJsonFile();	
		
    }//end oneTimeSetUp
	
	
	@AfterClass
	public static void tearDown(){
		driver.close();
	}
}
