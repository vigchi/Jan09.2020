package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ques1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh Chinnappa\\eclipse-workspace\\Day2Task\\Drivers\\chromedriver.exe");
		//Launching Browser 
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.xpath("//*[@id=\'content\']/table"));
		 List<WebElement> rows = table.findElements(By.tagName("tr"));
		 
		 for (WebElement row : rows) {
	           List<WebElement> cols = row.findElements(By.tagName("td"));
	           List<WebElement> cols2 = row.findElements(By.tagName("th"));	
	           		for (WebElement col2 : cols2) {
	           			System.out.print(col2.getText()+ "\t");
					}
	                  for (WebElement col : cols) {
	                        System.out.print(col.getText() + "\t");
	                  }
	          System.out.println();
	          }
		

	}

}
