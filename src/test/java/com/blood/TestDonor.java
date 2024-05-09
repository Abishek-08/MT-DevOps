//package com.blood;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class TestDonor {
//
//	WebDriver driver = new ChromeDriver();
//
//	@Test
//	public void test_DonorPage() throws InterruptedException {
//
//		driver.get("http://localhost:3000/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//
//		driver.findElement(By.linkText("BloodDonor")).click();
//		Thread.sleep(2000);
//		
//		WebElement btnDelDnr = driver.findElement(By.xpath("//Button[@name='16']"));
//		 Actions action1 = new Actions(driver);
//	       action1.moveToElement(btnDelDnr).click().build().perform();
//
//		WebElement addDonorBtn = driver.findElement(By.name("addDonorBtn"));
//		addDonorBtn.click();
//		Thread.sleep(2000);
//	
//		
//		
//		
//		WebElement donorName = driver.findElement(By.name("dnrName"));
//	       donorName.sendKeys("Ajith");
//	       Thread.sleep(2000);
//	       
//	       WebElement donorAge = driver.findElement(By.name("dnrAge"));
//	       donorAge.sendKeys("55");
//	       Thread.sleep(2000);
//	       
//	       WebElement donorWeight = driver.findElement(By.name("dnrWeight"));
//	       donorWeight.sendKeys("78kg");
//	       Thread.sleep(2000);
//	       
//	       WebElement donorMobile = driver.findElement(By.name("dnrMob"));
//	       donorMobile.sendKeys("74269541");
//	       Thread.sleep(2000);
//	       
//	       WebElement donorLocation = driver.findElement(By.name("dnrLocation"));
//	       donorLocation.sendKeys("Chennai");
//	       Thread.sleep(2000);
//	       
//	       
//	       
//	        WebElement element =  driver.findElement(By.xpath("//button[@id='btnInsert']"));
//	       Actions action = new Actions(driver);
//	       action.moveToElement(element).click().build().perform();
//	       
//	      
//	}
//
//}
