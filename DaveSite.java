package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DaveSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.get("https://www.davesite.com/webstation/js/theory1jump.shtml");
		
		WebElement jBox=d.findElement(By.name("myjumpbox"));
        Select jumpBox=new Select(jBox);
        Thread.sleep(2000);
        jumpBox.selectByVisibleText("davesite.com");
        
        Select jumpBox2=new Select(jBox);
        Thread.sleep(2000);
        jumpBox2.selectByVisibleText("neonlollipops.com");
	}

}
