package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.booking.com/");
		d.findElement(By.xpath("//div[@data-mode='checkin']")).click();
		while(true)
		{
		try
		{
		d.findElement(By.xpath("//span[contains(@aria-label,'March')]/span[text()='24']")).click();
        break;
		}
		catch(Exception e)
	      {
			d.findElement(By.xpath("//div[@data-bui-ref='calendar-next']")).click();
          }
		}
	}
}
