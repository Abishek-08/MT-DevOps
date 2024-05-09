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
//public class TestStock {
//	
//	@Test
//	public void test_Stock() throws InterruptedException {
//		
//		WebDriver driver = new ChromeDriver();
//	    driver.get("http://localhost:3000/");
//	    driver.manage().window().maximize();
//	    Thread.sleep(2000);
//	    
//		driver.findElement(By.linkText("BloodStock")).click();
//		Thread.sleep(2000);
//		
//		WebElement btnDelStk = driver.findElement(By.xpath("//Button[@name='12']"));
//		 Actions action1 = new Actions(driver);
//	       action1.moveToElement(btnDelStk).click().build().perform();
//		
//		driver.findElement(By.name("addbtnBlood")).click();
//		Thread.sleep(2000);
//		
//		WebElement dnrName = driver.findElement(By.name("dnrName"));
//		dnrName.findElement(By.xpath("//option[@value='10']")).click();
//		Thread.sleep(2000);
//		
//		WebElement blGroup = driver.findElement(By.name("blGroup"));
//		blGroup.sendKeys("O+ve");
//		Thread.sleep(2000);
//		
//		WebElement blCount = driver.findElement(By.name("blCount"));
//		blCount.sendKeys("88");
//		Thread.sleep(2000);
//		
//		WebElement blRBC = driver.findElement(By.name("blRBC"));
//		blRBC.sendKeys("537mgh");
//		Thread.sleep(2000);
//		
//		WebElement blWBC = driver.findElement(By.name("blWBC"));
//		blWBC.sendKeys("500mgh");
//		Thread.sleep(2000);
//		
//		WebElement element = driver.findElement(By.name("btnInsert"));
//		Actions action = new Actions(driver);
//		action.moveToElement(element).click().build().perform();
//		
//		
//	}
//
//}
