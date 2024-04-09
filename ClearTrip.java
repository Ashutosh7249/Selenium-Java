package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	
	public static void main(String[] args) throws InterruptedException {
		String expErr="Sorry, but we can't continue until you fix everything that's marked in RED";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(40, TimeUnit.MINUTES);
		d.get("https://www.cleartrip.com/");
		WebElement sb=d.findElement(By.xpath("//button[text()='Search flights']"));
		sb.click();
		WebElement errmsg=d.findElement(By.xpath("//div[contains(text(),'continue until you fix everything')]"));
		String actErrMsg=errmsg.getText();
		System.out.println("ExpErr="+expErr);
        System.out.println("ActErr="+actErrMsg);
        if(actErrMsg.equals(expErr))
        {
        	System.out.println("ErrMsg is validate successfully");
        }
        else
        {
        	System.out.println("ErrMSg is not validate");
        }
        
        WebElement frm=d.findElement(By.id("FromTag"));
        String attributeVal=frm.getAttribute("placeholder");
        System.out.println("PlaceHolder="+attributeVal);
        
        WebElement totag=d.findElement(By.id("ToTag"));
        String attributeVal1=totag.getAttribute("placeholder");
        System.out.println("PlaceHolder="+attributeVal1);
        
        WebElement depdate=d.findElement(By.id("DepartDate"));
        String attributeVal2=depdate.getAttribute("placeholder");
        System.out.println("PlaceHolder="+attributeVal2);
        
        WebElement ow=d.findElement(By.xpath("//strong[text()='One way']"));
        System.out.println("Enabled="+ow.isEnabled());
        System.out.println("Displayed="+ow.isDisplayed());
        System.out.println("Selected="+ow.isSelected());
        
        WebElement rt=d.findElement(By.xpath("//strong[text()='Round trip']"));
        System.out.println("Enabled="+rt.isEnabled());
        System.out.println("Displayed="+rt.isDisplayed());
        System.out.println("Selected="+rt.isSelected());
        
        WebElement mc=d.findElement(By.xpath("//strong[text()='Multi-city']"));
        System.out.println("Enabled="+mc.isEnabled());
        System.out.println("Displayed="+mc.isDisplayed());
        System.out.println("Selected="+mc.isSelected());
        
        Point p=sb.getLocation();
        System.out.println("X coordinates="+p.x);
        System.out.println("Y coordinates="+p.y);
        
        Dimension di=sb.getSize();
        System.out.println("Height="+di.height);
        System.out.println("Width="+di.width);
        
        Rectangle r=sb.getRect();
        System.out.println("X Coordinates="+r.getX());
        System.out.println("Y Coordinates="+r.getY());
        System.out.println("Height="+r.getHeight());
        System.out.println("Width="+r.getWidth());
        System.out.println("Dimension="+r.getDimension());
	}

}
