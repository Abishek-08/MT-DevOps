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
//public class TestUser {
//	
//	@Test
//	public void test_UserPage() throws InterruptedException {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost:3000/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.linkText("User")).click();
//		Thread.sleep(2000);
//		
//		WebElement bldGrp = driver.findElement(By.name("bldDrp"));
//		bldGrp.findElement(By.xpath("//option[@value='A+ve']")).click();
//		Thread.sleep(2000);
//		
//		WebElement btnSearch = driver.findElement(By.name("btnSearch"));
//		Actions action = new Actions(driver);
//		action.moveToElement(btnSearch).click().build().perform();
//		Thread.sleep(2000);
//		
//		WebElement btnDnr = driver.findElement(By.name("btnDnr"));
//		Actions action1 = new Actions(driver);
//		action1.moveToElement(btnDnr).click().build().perform();
//		
//		
//	}
//
//}
