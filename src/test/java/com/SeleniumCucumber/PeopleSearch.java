package com.SeleniumCucumber;

//import org.json.simple.parser.ParseException;
import java.nio.ReadOnlyBufferException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.eclipse.jetty.util.thread.Timeout;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import com.Selenium.SsJsonHandler;
import com.thoughtworks.selenium.Selenium;

import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.en.*;


public class PeopleSearch {
	static String Name;
	//static WebDriver driver;
	//static SsJsonHandler jh;
	/*
	@Before
	public void oneTimeSetUp() throws ParseException {
        // one-time initialization code 
		jh = new SsJsonHandler();
		jh.readJsonFile();	
		
    }//end oneTimeSetUp
	*/

	@Given("^the user is on search people page$")
	public void the_user_is_on_search_people_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		CukesRunner.driver = new FirefoxDriver();
		CukesRunner.driver.get(CukesRunner.jh.getURL());
		
	}

	@When("^he enters \"([^\"]*)\" as employee last name$")
	public void he_enters_as_employee_last_name(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		CukesRunner.driver.findElement(By.id("home_search_criteria")).sendKeys(arg1);
	    
	}

	@When("^he submits search request$")
	public void he_submits_search_request() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		CukesRunner.driver.findElement(By.id("home-search-button")).click();
	    
	}

	@Then("^ensure employee with last name \"([^\"]*)\" is presented$")
	public void ensure_employee_with_last_name_is_presented(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		// Try to get text
		 while (true) {
		   try {
		     WebElement findElement = CukesRunner.driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/div"));
		     ;
		     
		     Assert.assertTrue((findElement.getText()).equals(arg1));
		     break;
		// If there is no text sleep one second and try again
		   } catch (org.openqa.selenium.NoSuchElementException e) {
		     System.out.println("Waiting...");
		     Thread.sleep(1000);
		   }
		 }
		/*
		 List<WebElement> elements = CukesRunner.driver.findElements(By.className("ng-binding"));
		 
		 Assert.assertTrue(elements.contains(arg1));
		 
           Assert.assertTrue(elements.size() >= 1);
	       */     
	        
        /*
          List<WebElement> links = CukesRunner.driver.findElements(By.tagName(arg1));

        Iterator<WebElement> itr = links.iterator();
        while(itr.hasNext()){
            String test = itr.next().getText();

            if(test.equals(arg1)){
            String xpath = CukesRunner.driver.findElement(By.name(test)).getAttribute("xpath");
            System.out.println(xpath);
            }
        }
         */
		
	}

}//end class
