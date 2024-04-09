package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonMouseHover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("https://www.amazon.com/");
		WebElement flag=d.findElement(By.id("icp-nav-flyout"));
		Actions act=new Actions(d);
		act.moveToElement(flag).perform();
		Thread.sleep(2000);
		WebElement change=d.findElement(By.xpath("(//span[text()='$ - USD- U.S. Dollar']/following-sibling::a)[1]"));
		act.click(change).perform();
	    WebElement rupee=d.findElement(By.xpath("//span[text()='$ - USD - U.S.Dollar (Default)']"));
	    Thread.sleep(3000);
	    Select s=new Select(rupee);
	    s.selectByValue("{\"stringVal\":\"INR\"}");
	}

}
