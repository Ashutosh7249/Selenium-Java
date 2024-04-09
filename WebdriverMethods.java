package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver;
		 
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  Thread.sleep(3000);
		  driver.get("https://www.google.com/");
           Thread.sleep(1000);
	      
		   String url=driver.getCurrentUrl();
		   System.out.println(url);
		   
		  String actualTitle=driver.getTitle();
		  String expectedTitle="google";
		  if(actualTitle.equalsIgnoreCase(expectedTitle))
		  {
			  
			  System.out.println("Google page displayed,test step passed");
		  }
		  else
		  {
			  System.out.println("google page not displayed, test step failed");
		  }
		  
		  Thread.sleep(1000);
	      Point p=new Point(400,500);
	      driver.manage().window().setPosition(p);
		  Thread.sleep(1000);
		  Dimension d=new Dimension(600,500);
		  driver.manage().window().setSize(d);
	}

}
