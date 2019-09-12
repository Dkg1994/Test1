package com.goibibo.WebApplication.DesktopFireFoxBrowsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Car_Vertical {
	 @Test
	  public void f() throws InterruptedException {
		  
		  
	  
		System.setProperty("webdriver.chrome.driver","D:\\Eclips backup\\Jar Files for use in selenium\\chromedriver_win32\\chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	      
	        driver.get("https://www.goibibo.com");
	       
	        
	        
	        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	        
	        

		
//	        --------------------------------------------- Click on Car Icon-----------------------
	        
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[6]/a/i")).click();
	       
	        
	        Thread.sleep(1000);
	//  ----------------------------------------Click on Source Point--------------------------------
	        
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[1]/div[1]/div/p")).click();
	        
	        
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//*[@id=\"gosuggest_inputL\"]")).sendKeys("Delhi");
	     
	        
			driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
			
			
//			--------------------------------------Click on Destination Point----------------------------------------
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[1]/div[2]/div/p")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"gosuggest_inputL\"]")).sendKeys("Agra");
		
			
			
			driver.findElement(By.id("react-autosuggest-1-suggestion--0")).click();
			
			
				Thread.sleep(500);
//			-----------------------------------------Click On Search Button------------------------------------
				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/section[2]/section[2]/div[3]/button")).click();
			
//			--------------------------------Click on Icon on Review page----------------------
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div[2]/label/p[1]")).click();
			
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div[3]/label")).click();
		
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[1]/div[1]/label")).click();
			
			Thread.sleep(1000);
			
//			---------------------------------- Go to  Travellar Details-------------------------
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/div[2]/section[2]/div[1]/span[2]")).click();
		
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[1]/div[2]/div/label[1]/span")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[1]/div[3]/input")).sendKeys("Test");
		
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[2]/p/input")).sendKeys("9999999999");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[3]/p/input")).sendKeys("testnoc009@gmail.com");
		
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[1]/section/section[2]/div/section[2]/div[5]/p/button")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/section[2]/div[3]/div[2]/p[2]/span")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[2]/div/div/div[1]/div/div[3]/span")).click();
		
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/section/div/section[1]/section/div[3]/div[2]/button")).click();
		
			Thread.sleep(6000);

			driver.findElement(By.xpath("//*[@id=\"nb\"]/div[1]/div[1]/div[2]/span")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"selectedBank\"]/option[6]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"nbPayNow\"]/div/button")).click();
			
			
			Thread.sleep(2000);
			
			driver.close();
			
			 driver.quit();
				
		}
		
		

	}
