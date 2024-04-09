package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String eTitle="Meet Guru99 - Free Training Tutorials & Video for IT Courses";
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
		String aTitle=driver.getTitle();
		System.out.println(aTitle);
		if(aTitle.contains(eTitle))
		{
			System.out.println("Test passed");
			}
		else
		{
			System.out.println("Test Failed");
		}
	}

}
