package com.goibibo.Web.Goibibo_Desktop1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Dom_Flight {
	@Test
	  public void f() throws InterruptedException {
		  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Program Files (x86)\\Jenkins\\workspace\\Maven Project (Desktop)\\test-output\n" + 
		  		"Dom_FLight.html");
		    
	      // create ExtentReports and attach reporter(s)
	      ExtentReports extent = new ExtentReports();
	      extent.attachReporter(htmlReporter);
	      
	      
	      ExtentTest test1 = extent.createTest("Goibibo Dom_Flight ", "Check Flow of Flight");
	  

		  
			
		  System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver_win32\\chromedriver.exe");
		  		
		          WebDriver driver = new ChromeDriver();
		          
		          JavascriptExecutor js = (JavascriptExecutor) driver;

		          
		          driver.manage().window().maximize();
		          
			  		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


			  		test1.log(Status.INFO, "Starting test case");
			        driver.get("https://www.goibibo.com");
			        test1.pass("Go to Goibibo");
			        extent.flush();
		          
		          
		  				
		          driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[1]/a/i")).click();
		          test1.pass("Click on Flight Icon");
		          extent.flush();
		          
		          Thread.sleep(2000);
		          
		          WebElement listbox = driver.findElement(By.xpath("//*[@id=\"gosuggest_inputSrc\"]"));
		          
		          listbox.sendKeys("D");
		          test1.pass("Enter Source name");
		          extent.flush();
		          
		          Thread.sleep(3000);
		          
		        
		          driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
		          
		          Thread.sleep(3000);
		          
		          test1.pass("Click on city from Dropdown");
		          extent.flush();
		          
		          driver.findElement(By.xpath("//*[@id=\"gosuggest_inputDest\"]")).sendKeys("Mum");
		          test1.pass("Enter Detination name");
		          extent.flush();
		          
		          Thread.sleep(3000);
		          
		          driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
		       
		          test1.pass("Click on city from Dropdown");
		          extent.flush();
		          
//		          To click on date picker
		          
		          driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[5]/div/div/div[1]/span")).click();                
		          test1.pass("Click on Day-picker");
		          extent.flush();
		          
		          Thread.sleep(1000);
		          
//		          To select date
		          
		          driver.findElement(By.xpath("//*[@id=\"price_20191030\"]")).click();
		          test1.pass("Click on Date 27");
		          extent.flush();
		          
//		          To click on search button
		          
		          Thread.sleep(1000);
		          
		          driver.findElement(By.xpath("//*[@id=\"gi_search_btn\"]")).click();
		          test1.pass("Search");
		          extent.flush();
		          
		          Thread.sleep(5000);
		        
//		          To check airlines filters.
		          
		  driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/label[1]/span[1]")).click();
		    test1.pass("Click on Airlines Filter");
		    extent.flush();
		    
		    Thread.sleep(4000);
		    
		    
		    js.executeScript("window.scrollBy(0,350)");
		    
		    
		    Thread.sleep(2000);
		    
		  //  Click on Air-india from airline filter
		    
		    driver.findElement(By.xpath("//div[@id='IndiGo']//span[contains(@class,'checkmark dIF alignItemsCenter justifyCenter')]")).click();
		    
		    test1.pass("Click on Airindia Airline from Filter");
    extent.flush();
		    
		    Thread.sleep(9000);
		    
		  //  To click on book button
		    
		    
		       driver.findElement(By.xpath("//input[@class='button fr fltbook fb widthF105 fb quicks']")).click();
		       test1.pass("Click on Book button");
		       extent.flush();
		       
		       Thread.sleep(5000);
		       
//		       To click on Baggage & fare rule button on review page
		       
		     driver.findElement(By.linkText("Baggage and Fare Rules")).click();
		     test1.pass("Click on Baggage & Fare Rules policy");
		     extent.flush();
		     Thread.sleep(2000);
		     
		  //   Click on Fare Rule from popup
		     
		     driver.findElement(By.linkText("Fare Rules")).click();
		     test1.pass("Click on Fare Rule");
		     extent.flush();
		     Thread.sleep(1000);
		     
		  //   Close Baggage & fare popup window
		     
		     driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/div/div[1]/div[1]/div[3]/div[2]/div/a")).click();
		     test1.pass("Close popup window");
		     extent.flush();
		     
		     Thread.sleep(1000);
		       
		  //   Select Mr. from trveller details
		     
		       WebElement option = driver.findElement(By.xpath("//*[@id=\"Adulttitle1\"]"));
		       
		       option.sendKeys(Keys.DOWN);
		       
		       option.sendKeys(Keys.ENTER);
		       test1.pass("Select Mr. & Mrs.");
		       extent.flush();
		       
		       Thread.sleep(1000);
		       
//		       Input First name
		       
		       driver.findElement(By.xpath("//*[@id=\"AdultfirstName1\"]")).sendKeys("Devendra");
		       test1.pass("Enter First Name");
		       extent.flush();
		       
		       Thread.sleep(1000);
		       
//		       Input Last Name
		       
		       driver.findElement(By.xpath("//*[@id=\"AdultlastName1\"]")).sendKeys("Gupta");
		       test1.pass("Enter Last Name");
		       extent.flush();
		       
		       Thread.sleep(1000);
		       
//		       Input Email Id
		       
		       driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testnoc009@gmail.com");
		       test1.pass("ENter Email");
		       extent.flush();
		       
		       Thread.sleep(1000);
		       
//		       Input Mobile No.
		       
		       driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9999999999");
		       test1.pass("Enter Mobile No.");
		       extent.flush();
		       
		       Thread.sleep(5000);
		       
//		       Click on Proceed to Payment button
		       
		       driver.findElement(By.xpath("//*[@id=\"travellerForm\"]/div[2]/button")).click();
		       test1.pass("Proceed To Payment");
		       extent.flush();
		       
		       Thread.sleep(10000);
		       
//		       Click on Net banking option
		       
		       driver.findElement(By.xpath("//*[@id=\"nb\"]")).click();
		       test1.pass("Click on Net Banking");
		       extent.flush();
		       
		       Thread.sleep(2000);
		       
//		       Click on bank which we want to test
		       
		       driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[4]")).click();
		       test1.pass("Select Bank");
		       extent.flush();
		       
		       Thread.sleep(2000);
		       
//		       Click on paynow button
		       
		       driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
		       test1.pass("Click to Pay now button");
		       extent.flush();
		       
		       Thread.sleep(4000);
		       
		       driver.close();
		       
		       driver.quit();
				test1.pass("Close browser");
				 
				 test1.info("Test Completed");
				 
				// calling flush writes everything to the log file
				 extent.flush();
		       

		  	}

		  }
