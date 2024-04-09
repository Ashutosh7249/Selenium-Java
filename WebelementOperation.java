package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementOperation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ocsm12workspace\\Automation\\drivers\\chromedriver.exe");
		  WebDriver wb=new ChromeDriver();
		  wb.manage().window().maximize();
		  Thread.sleep(2000);
		  wb.get("https://www.facebook.com/");
		  Thread.sleep(1000);
		  WebElement we=wb.findElement(By.id("email"));
		  Thread.sleep(2000);
		  we.sendKeys("ashutosh");
		  WebElement po=wb.findElement(By.id("pass"));
		  Thread.sleep(2000);
		  po.sendKeys("ashu");
		  Thread.sleep(2000);
		  WebElement fl=wb.findElement(By.xpath("//button[@name='login']"));
		  Thread.sleep(2000); 
		  fl.click();
		   wb.close();
		 
		  
	}

}
