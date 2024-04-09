package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FilePopupPractice {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("https://www.monsterindia.com/");
		d.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		Thread.sleep(2000);
		WebElement wb=d.findElement(By.xpath("//button[text()='Or select file to upload']"));
	    Actions act=new Actions(d);
	    act.moveToElement(wb).click().perform();
	    String filepath="C:\\Users\\ASUS\\Downloads\\sanjeebUpdateCv.doc";
	    StringSelection sel=new StringSelection(filepath);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	    Thread.sleep(3000);
	    Robot r=new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    Thread.sleep(2000);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(3000);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	}

}
